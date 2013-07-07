/*
 * 文 件 名:  ImageUploadService.java
 * 描    述:  ImageUploadService.java
 * 时    间:  2013-7-1
 */
package com.babyshow.upload.service;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.fileupload.FileItem;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.upload.UploadStaticConstant;
import com.babyshow.upload.bean.ImageUpload;
import com.babyshow.upload.dao.ImageUploadDao;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class ImageUploadService
{
    /**
     * 日志
     */
    private static Logger log = Logger.getLogger(ImageUploadService.class);
    
    @Autowired
    private ImageUploadDao imageUploadDao;
    
    /**
     * 
     * 写入用户上传记录
     * 
     * @param imageUpload
     */
    public void insertImageUpload(ImageUpload imageUpload)
    {
        Date uploadTime = new Date();
        imageUpload.setUploadTime(uploadTime);
        imageUpload.setResult(UploadStaticConstant.IMAGE_UPLOAD_STATUS_INIT);
        this.imageUploadDao.insertImageUpload(imageUpload);
    }
    
    /**
     * 
     * 根据七牛Key查找上传照片记录
     * @param qiniuKey
     * @return
     */
    public ImageUpload findImageUploadByQiniuKey(String qiniuKey)
    {
        return this.imageUploadDao.findImageUploadByQiniuKey(qiniuKey);
    }
    
    /**
     * 
     * 根据七牛Key更新上传结果
     * @param result
     * @param qiniuKey
     */
    public void updateImageUploadResultByQiniuKey(int result, String qiniuKey)
    {
        this.imageUploadDao.updateImageUploadResultByQiniuKey(result, qiniuKey);
    }
    
    /**
     * 
     * 本地文件写入，失败抛出Exception异常
     * 
     * @param folderName
     * @param fileName
     * @param fileItem
     * @return file
     * @throws Exception
     */
    public File storeImageToDisk(String folderName, String fileName, FileItem fileItem)
        throws Exception
    {
        File file = new File(folderName, fileName);
        // 创建文件夹
        File folder = new File(folderName);
        if (!folder.exists())
        {
            folder.mkdirs();
        }
        // 创建文件
        fileItem.write(file);
        return file;
    }
    
    /**
     * 
     * 从Request中解析FormData
     * @param itemList
     * @return
     */
    public Map<String, String> parseDataRequest(List<FileItem> itemList)
    {
        Map<String, String> paramMap = new HashMap<String, String>();
        for (FileItem item : itemList)
        {
            // 文件类型
            if (item.isFormField())
            {
                String fieldName = item.getFieldName();
                String value = item.getString();
                paramMap.put(fieldName, value);
            }
        }
        return paramMap;
    }
    
    /**
     * 
     * 从Request中解析文件
     * 
     * @param itemList
     * @return
     */
    public FileItem parseFileRequest(List<FileItem> itemList)
    {
        for (FileItem fileItem : itemList)
        {
            // 文件类型
            if (!fileItem.isFormField())
            {
                return fileItem;
            }
        }
        return null;
    }
    
    /**
     * 
     * 从FileItem中获取扩展名
     * 
     * @param fileItem
     * @return
     */
    public String parseFileItem(FileItem fileItem)
    {
        // 确定上传路径及上文件名
        String fileName = fileItem.getName();
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
