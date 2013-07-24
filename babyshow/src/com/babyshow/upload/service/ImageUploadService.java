/*
 * �� �� ��:  ImageUploadService.java
 * ��    ��:  ImageUploadService.java
 * ʱ    ��:  2013-7-1
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
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class ImageUploadService
{
    /**
     * ��־
     */
    private static Logger log = Logger.getLogger(ImageUploadService.class);
    
    @Autowired
    private ImageUploadDao imageUploadDao;
    
    /**
     * 
     * д���û��ϴ���¼
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
     * ������ţKey�����ϴ���Ƭ��¼
     * @param qiniuKey
     * @return
     */
    public ImageUpload findImageUploadByQiniuKey(String qiniuKey)
    {
        return this.imageUploadDao.findImageUploadByQiniuKey(qiniuKey);
    }
    
    /**
     * 
     * ������ţKey�����ϴ����
     * @param result
     * @param qiniuKey
     */
    public void updateImageUploadResultByQiniuKey(int result, String qiniuKey)
    {
        this.imageUploadDao.updateImageUploadResultByQiniuKey(result, qiniuKey);
    }
    
    /**
     * 
     * �����ļ�д�룬ʧ���׳�Exception�쳣
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
        // �����ļ���
        File folder = new File(folderName);
        if (!folder.exists())
        {
            folder.mkdirs();
        }
        // �����ļ�
        fileItem.write(file);
        return file;
    }
    
    /**
     * 
     * ��Request�н���FormData
     * @param itemList
     * @return
     */
    public Map<String, String> parseDataRequest(List<FileItem> itemList)
    {
        Map<String, String> paramMap = new HashMap<String, String>();
        for (FileItem item : itemList)
        {
            // �ļ�����
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
     * ��Request�н����ļ�
     * 
     * @param itemList
     * @return
     */
    public FileItem parseFileRequest(List<FileItem> itemList)
    {
        for (FileItem fileItem : itemList)
        {
            // �ļ�����
            if (!fileItem.isFormField())
            {
                return fileItem;
            }
        }
        return null;
    }
    
    /**
     * 
     * ��FileItem�л�ȡ��չ��
     * 
     * @param fileItem
     * @return
     */
    public String parseFileItem(FileItem fileItem)
    {
        // ȷ���ϴ�·�������ļ���
        String fileName = fileItem.getName();
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
