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
import com.babyshow.rest.RestHelper;
import com.babyshow.rest.RestResponse;
import com.babyshow.rest.RestService;
import com.babyshow.upload.bean.ImageUpload;
import com.babyshow.upload.service.ImageUploadService;
import com.babyshow.util.PropertiesUtil;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-14]
 */
@Service
public class UploadStatusRestService extends RestService
{
    @Autowired
    private ImageUploadService imageUploadService;
    
    @Autowired
    private ImageService imageService;
    
    public UploadStatusResponse handleUploadStatus(UploadStatusRequest uploadStatusRequest)
    {
        UploadStatusResponse uploadStatusResponse = new UploadStatusResponse();
        String deviceID = uploadStatusRequest.getDevice_id();
        
        // 校验ID是否存在
        boolean userValidate = this.validateUser(deviceID, uploadStatusResponse);
        if(!userValidate)
        {
            uploadStatusResponse.setRequest("uploadStatusRequest");
            return uploadStatusResponse;
        }
        
        // 接受请求来的上传信息，把上传成功的图片写入image表
        String qiniuKey = uploadStatusRequest.getQiniu_key();
        
        // 校验七牛key
        boolean qiniuKeyValidate = this.validateQiniuKey(qiniuKey, uploadStatusResponse);
        if(!qiniuKeyValidate)
        {
            uploadStatusResponse.setRequest("uploadStatusRequest");
            return uploadStatusResponse;
        }
        
        ImageUpload imageUpload = this.imageUploadService.findImageUploadByQiniuKey(qiniuKey);
        // 上传成功
        if(uploadStatusRequest.getUpload_status())
        {
            Image image = new Image();
            image.setCreatedTime(new Date());
            image.setDescription(imageUpload.getDescription());
            image.setImageCode(imageUpload.getImageCode());
            image.setStatus(0);
            image.setLikeCount(0);
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
    
    
    /**
     * 
     * 校验qiniukey，存在返回true，不存在返回false
     * <br>
     * 校验失败时restResponse会写入错误码和错误信息
     * 
     * @param qiniuKey
     * @param restResponse
     * @return
     */
    private boolean validateQiniuKey(String qiniuKey, RestResponse restResponse)
    {
        ImageUpload imageUpload = this.imageUploadService.findImageUploadByQiniuKey(qiniuKey);
        if(imageUpload == null)
        {
            String errors = PropertiesUtil.loadI18NProperty("upload.qiniukey.notexist");
            RestHelper.generateErrorMsg(restResponse, errors);
            return false;
        }
        return true;
    }
}
