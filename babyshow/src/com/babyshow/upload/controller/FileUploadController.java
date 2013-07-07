package com.babyshow.upload.controller;

/*
 * 文 件 名:  BabyshowController.java
 * 描    述:  BabyshowController.java
 * 时    间:  2013-6-17
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.babyshow.image.ImageStaticConstant;
import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.imagemock.bean.ImageMockRecord;
import com.babyshow.imagemock.service.ImageMockService;
import com.babyshow.upload.UploadStaticConstant;
import com.babyshow.upload.bean.FileMeta;
import com.babyshow.upload.bean.FileMetaResponse;
import com.babyshow.upload.qiniu.QiniuUploadService;
import com.babyshow.upload.service.ImageUploadService;
import com.babyshow.util.HttpClientUtil;
import com.babyshow.util.QiNiuUtil;
import com.babyshow.util.UUIDGenerator;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Controller
public class FileUploadController
{
    @Value("${qiniu_upload_url}")
    private String qiniuUploadUrl;
    
    /**
     * 日志
     */
    private static Logger log = Logger.getLogger(FileUploadController.class);
    
    @Autowired
    private ImageUploadService imageUploadService;
    
    @Autowired
    private ImageMockService imageMockService;
    
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private QiniuUploadService qiniuUploadService;
    
    /**
     * 
     * 单个文件上传
     * 
     * @param request
     * @param response
     * @return
     * @throws FileUploadException
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody
    FileMetaResponse upload(HttpServletRequest request, HttpServletResponse response, HttpSession session)
        throws FileUploadException
    {
        FileMetaResponse fileMetaResponse = new FileMetaResponse();
        // 文件上传处理工厂
        FileItemFactory factory = new DiskFileItemFactory();
        // 创建文件上传处理器
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 开始解析请求信息
        List<FileItem> itemList = upload.parseRequest(request);
        
        // 文件解析
        FileItem fileItem = this.imageUploadService.parseFileRequest(itemList);
        if(fileItem == null)
        {
            return fileMetaResponse;
        }
        // 获取文件扩展名
        String extName = this.imageUploadService.parseFileItem(fileItem);
        
        // 普通数据解析
        Map<String, String> paramMap = this.imageUploadService.parseDataRequest(itemList);

        // 获取页面usercode数据
        String userCode = paramMap.get("usercode");
        // 获取local路径
        String localPath = request.getSession().getServletContext().getRealPath(UploadStaticConstant.SEPARATOR);
        String uploadPath = UploadStaticConstant.UPLOAD_PATH + UploadStaticConstant.SEPARATOR + userCode;
        String localUploadPath = localPath + uploadPath;
        
        // 文件存储名
        String imageCode = UUIDGenerator.generateImageCode();
        String storeFileName = QiNiuUtil.generateStoreFileName(imageCode, extName);
        String realUploadFilePath = localUploadPath + UploadStaticConstant.SEPARATOR + storeFileName;
        
        // 本地文件写入
        File file = null;
        try
        {
            file = this.imageUploadService.storeImageToDisk(localUploadPath, storeFileName, fileItem);
        }
        catch (Exception e)
        {
            return fileMetaResponse;
        }
        
        // 上传七牛
        
        String token = this.qiniuUploadService.makeAuthTokenString();
        String qiniuKey = QiNiuUtil.generateQiniuKey(userCode, imageCode, extName);
        Map<String, Object> uploadMap = new HashMap<String, Object>();
        uploadMap.put("key", qiniuKey);
        uploadMap.put("file", file);
        uploadMap.put("token", token);
        HttpClientUtil.postData("http://up.qiniu.com/", uploadMap);
        
        
        // 记录图片数据表
        Image image = new Image();
        image.setImageCode(imageCode);
        image.setStatus(ImageStaticConstant.IMAGE_STATUS_NORMAL);
        image.setUrlKey(qiniuKey);
        
        // TODO 日期要通过2个节点拼 天和小时
        //image.setCreatedTime();
        //image.setDescription(description);
        image.setUserCode(userCode);
        this.imageService.insertImage(image);
        // 记录数据库 mock表
        ImageMockRecord imageMockRecord = new ImageMockRecord();
        imageMockRecord.setImageCode(imageCode);
        imageMockRecord.setMockTime(new Date());
        //imageMockRecord.setMockValue(mockValue);
        //imageMockRecord.setOperatorCode(operatorCode);
        this.imageMockService.insertImageMockRecordDao(imageMockRecord);
        
        // 写入图片临时文件
        List<FileMeta> fileMetaListTemp = new ArrayList<FileMeta>();
        FileMeta fileMeta = new FileMeta();
        fileMeta.setId(imageCode);
        fileMeta.setName(storeFileName);
        String url = request.getContextPath() + uploadPath + UploadStaticConstant.SEPARATOR + storeFileName;
        fileMeta.setUrl(url);
        fileMeta.setThumbnail_url(url);
        fileMeta.setDelete_type(UploadStaticConstant.DELETE_TYPE);
        fileMeta.setDelete_url(UploadStaticConstant.DELETE_URL + fileMeta.getId());
        fileMeta.setRealPath(realUploadFilePath);
        fileMetaListTemp.add(fileMeta);
        fileMetaResponse.setFiles(fileMetaListTemp);
        
      
        List<FileMeta> fileMetaList = (List<FileMeta>)session.getAttribute(UploadStaticConstant.FILELIST_SESSION_STRING);
        // 将已上传数据保存进用户session
        if(fileMetaList == null)
        {
            fileMetaList = new ArrayList<FileMeta>();
        }
        fileMetaList.add(fileMeta);
        session.setAttribute(UploadStaticConstant.FILELIST_SESSION_STRING, fileMetaList);
        
        return fileMetaResponse;
    }
    
    /**
     * 
     * 删除缓存文件
     * 
     * @param id
     */
    @RequestMapping(value = "/upload/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    void deleteImage(@PathVariable
    String id, HttpSession session)
    {
        List<FileMeta> fileMetaList = (List<FileMeta>)session.getAttribute(UploadStaticConstant.FILELIST_SESSION_STRING);
        
        for (FileMeta fileMeta : fileMetaList)
        {
            if (fileMeta.getId().equals(id))
            {
                // 删除本地文件
                String realPath = fileMeta.getRealPath();
                File file = new File(realPath);
                if (file.exists())
                {
                    file.delete();
                }
                // 删除内存
                fileMetaList.remove(fileMeta);
                session.setAttribute("fileList", fileMetaList);
                return;
            }
        }
        
    }
    
    /**
     * 查询已经上传的所有缓存文件
     * 
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public @ResponseBody
    FileMetaResponse getUploadFiles(HttpSession session)
    {
        List<FileMeta> fileMetaList = (List<FileMeta>)session.getAttribute(UploadStaticConstant.FILELIST_SESSION_STRING);
        FileMetaResponse fileMetaResponse = new FileMetaResponse();
        fileMetaResponse.setFiles(fileMetaList);
        return fileMetaResponse;
    }
    
}
