/*
 * �� �� ��:  UserImageDetailRestService.java
 * ��    ��:  UserImageDetailRestService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.rest.userimagedetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.ImageStaticConstant;
import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestService;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserImageDetailRestService extends RestService
{
    @Autowired
    private ImageService imageService;
    
    /**
     * 
     * ��Ƭ����鿴
     * 
     * @param userImageDetailResponse
     * @return
     */
    public UserImageDetailResponse handleUserImageDetail(UserImageDetailRequest userImageDetailRequest)
    {
        UserImageDetailResponse userImageDetailResponse = new UserImageDetailResponse();
        String deviceID = userImageDetailRequest.getDevice_id();
        
        // У��ID�Ƿ����
        boolean userValidate = this.validateUser(deviceID, userImageDetailResponse);
        if(!userValidate)
        {
            userImageDetailResponse.setRequest("userImageDetailRequest");
            return userImageDetailResponse;
        }
        
        String imageCode = userImageDetailRequest.getImage_id();
        
        // У��ͼƬ�Ƿ����
        boolean imageValidate = this.validateImage(imageCode, userImageDetailResponse);
        if(!imageValidate)
        {
            userImageDetailResponse.setRequest("userImageDetailRequest");
            return userImageDetailResponse;
        }
        
        Integer imageStyle = userImageDetailRequest.getImage_style();
        // ����ȡĬ��style
        if(imageStyle == null)
        {
            imageStyle = ImageStaticConstant.DEFAULT_IMAGE_STYLE;
        }
        Image image = this.imageService.findImageByImageCode(imageCode, imageStyle);

        String imageUrl = image.getUrl();
        userImageDetailResponse.setImageUrl(imageUrl);
        return userImageDetailResponse;
    }
}
