/*
 * �� �� ��:  UserImageDestoryRestService.java
 * ��    ��:  UserImageDestoryRestService.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.rest.userimagedestory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.service.ImageService;

/**
 * <һ�仰���ܼ���>
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
     * ɾ����Ƭ
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
