/*
 * �� �� ��:  UserImageDestoryRestService.java
 * ��    ��:  UserImageDestoryRestService.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.rest.userimagedestory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestService;

/**
 * <һ�仰���ܼ���>
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
     * ɾ����Ƭ
     * 
     * @param userImageDestoryRequest
     * @return
     */
    public UserImageDestoryResponse handleUserImageDestory(UserImageDestoryRequest userImageDestoryRequest)
    {   
        UserImageDestoryResponse userImageDestoryResponse = new UserImageDestoryResponse();
        String deviceID = userImageDestoryRequest.getDevice_id();
        
        // У��ID�Ƿ����
        boolean userValidate = this.validateUser(deviceID, userImageDestoryResponse);
        if(!userValidate)
        {
            userImageDestoryResponse.setRequest("userImageDestoryRequest");
            return userImageDestoryResponse;
        }
        
        String imageCode = userImageDestoryRequest.getImage_id();
        
        // У��ͼƬ�Ƿ����
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
