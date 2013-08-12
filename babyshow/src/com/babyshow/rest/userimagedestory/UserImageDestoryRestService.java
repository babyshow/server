/*
 * 文 件 名:  UserImageDestoryRestService.java
 * 描    述:  UserImageDestoryRestService.java
 * 时    间:  2013-7-1
 */
package com.babyshow.rest.userimagedestory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestService;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class UserImageDestoryRestService extends RestService
{
    @Autowired
    private ImageService imageService;
    
    /**
     * 删除照片
     * 
     * @param userImageDestoryRequest
     * @return
     */
    public UserImageDestoryResponse handleUserImageDestory(UserImageDestoryRequest userImageDestoryRequest)
    {   
        UserImageDestoryResponse userImageDestoryResponse = new UserImageDestoryResponse();
        String deviceID = userImageDestoryRequest.getDevice_id();
        
        // 校验ID是否存在
        boolean userValidate = this.validateUser(deviceID, userImageDestoryResponse);
        if(!userValidate)
        {
            userImageDestoryResponse.setRequest("userImageDestoryRequest");
            return userImageDestoryResponse;
        }
        
        String imageCode = userImageDestoryRequest.getImage_id();
        
        // 校验图片是否存在
        boolean imageValidate = this.validateImage(imageCode, userImageDestoryResponse);
        if(!imageValidate)
        {
            userImageDestoryResponse.setRequest("userImageDestoryRequest");
            return userImageDestoryResponse;
        }
        
        this.imageService.deleleImageByImageCode(imageCode);
        
        return userImageDestoryResponse;
    }
}
