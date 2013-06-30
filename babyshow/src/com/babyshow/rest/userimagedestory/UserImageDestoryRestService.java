/*
 * 文 件 名:  UserImageDestoryRestService.java
 * 描    述:  UserImageDestoryRestService.java
 * 时    间:  2013-7-1
 */
package com.babyshow.rest.userimagedestory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.service.ImageService;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class UserImageDestoryRestService
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
        String imageCode = userImageDestoryRequest.getImage_id();
        this.imageService.deleleImageByImageCode(imageCode);
        UserImageDestoryResponse userImageDestoryResponse = new UserImageDestoryResponse();
        return userImageDestoryResponse;
    }
}
