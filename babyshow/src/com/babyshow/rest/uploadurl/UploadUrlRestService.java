/*
 * 文 件 名:  UploadUrlRestService.java
 * 描    述:  UploadUrlRestService.java
 * 时    间:  2013-7-1
 */
package com.babyshow.rest.uploadurl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.rest.RestService;
import com.babyshow.upload.bean.ImageUpload;
import com.babyshow.upload.service.ImageUploadService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;
import com.babyshow.util.QiNiuUtil;
import com.babyshow.util.UUIDGenerator;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class UploadUrlRestService extends RestService
{
    @Autowired
    private UserService userService;
    
    @Autowired
    private ImageUploadService imageUploadService;
    
    /**
     * 查询七牛上传路径
     * 
     * @param uploadUrlRequest
     * @return
     */
    public UploadUrlResponse handleUploadUrl(UploadUrlRequest uploadUrlRequest)
    {
        UploadUrlResponse UploadUrlResponse = new UploadUrlResponse();
        String deviceID = uploadUrlRequest.getDevice_id();
        
        // 校验ID是否存在
        boolean userValidate = this.validateUser(deviceID, UploadUrlResponse);
        if(!userValidate)
        {
            UploadUrlResponse.setRequest("uploadUrlRequest");
            return UploadUrlResponse;
        }
        
        User user = this.userService.findUserByDeviceID(deviceID);
        String description = uploadUrlRequest.getImage_description();
        int shareType = uploadUrlRequest.getShare_type();
        String shareToken = uploadUrlRequest.getShare_token();
        String userCode = user.getUserCode();
        // 分配上传路径
        String imageCode = UUIDGenerator.generateImageCode();
        String qiniuKey = QiNiuUtil.generateQiniuKey(userCode, imageCode, "jpg");
        UploadUrlResponse.setQiniuKey(qiniuKey);
        // 入上传表
        ImageUpload imageUpload = new ImageUpload();
        imageUpload.setUserCode(userCode);
        imageUpload.setDescription(description);
        imageUpload.setShareType(shareType);
        imageUpload.setShareToken(shareToken);
        imageUpload.setImageCode(imageCode);
        imageUpload.setQiniuKey(qiniuKey);
        this.imageUploadService.insertImageUpload(imageUpload);
        return UploadUrlResponse;
    }
}
