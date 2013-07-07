/*
 * 文 件 名:  UploadStatusService.java
 * 描    述:  UploadStatusService.java
 * 时    间:  2013-7-14
 */
package com.babyshow.rest.uploadstatus;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.upload.bean.ImageUpload;
import com.babyshow.upload.service.ImageUploadService;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-14]
 */
@Service
public class UploadStatusService
{
    @Autowired
    private ImageUploadService imageUploadService;
    
    @Autowired
    private ImageService imageService;
    
    public UploadStatusResponse handleUploadStatus(UploadStatusRequest uploadStatusRequest)
    {
        UploadStatusResponse uploadStatusResponse = new UploadStatusResponse();
        // 接受请求来的上传信息，把上传成功的图片写入image表
        String qiniuKey = uploadStatusRequest.getQiniu_key();
        ImageUpload imageUpload = this.imageUploadService.findImageUploadByQiniuKey(qiniuKey);
        // 上传成功
        if(uploadStatusRequest.isUpload_status())
        {
            Image image = new Image();
            image.setCreatedTime(new Date());
            image.setDescription(imageUpload.getDescription());
            image.setImageCode(imageUpload.getImageCode());
            image.setStatus(0);
            image.setUrlKey(imageUpload.getQiniuKey());
            image.setUserCode(imageUpload.getUserCode());
            this.imageService.insertImage(image);
        }
        // 上传失败
        else
        {
            this.imageUploadService.updateImageUploadResultByQiniuKey(1, qiniuKey);
        }
           
        return uploadStatusResponse;
    }
    
}
