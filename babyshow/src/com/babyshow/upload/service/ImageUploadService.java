/*
 * �� �� ��:  ImageUploadService.java
 * ��    ��:  ImageUploadService.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.upload.service;

import java.util.Date;

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
}
