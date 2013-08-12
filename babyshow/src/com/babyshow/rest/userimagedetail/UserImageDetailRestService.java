/*
 * 文 件 名:  UserImageDetailRestService.java
 * 描    述:  UserImageDetailRestService.java
 * 时    间:  2013-6-30
 */
package com.babyshow.rest.userimagedetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.ImageStaticConstant;
import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestService;

/**
 * <一句话功能简述>
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
     * 照片详情查看
     * 
     * @param userImageDetailResponse
     * @return
     */
    public UserImageDetailResponse handleUserImageDetail(UserImageDetailRequest userImageDetailRequest)
    {
        UserImageDetailResponse userImageDetailResponse = new UserImageDetailResponse();
        String deviceID = userImageDetailRequest.getDevice_id();
        
        // 校验ID是否存在
        boolean userValidate = this.validateUser(deviceID, userImageDetailResponse);
        if(!userValidate)
        {
            userImageDetailResponse.setRequest("userImageDetailRequest");
            return userImageDetailResponse;
        }
        
        String imageCode = userImageDetailRequest.getImage_id();
        
        // 校验图片是否存在
        boolean imageValidate = this.validateImage(imageCode, userImageDetailResponse);
        if(!imageValidate)
        {
            userImageDetailResponse.setRequest("userImageDetailRequest");
            return userImageDetailResponse;
        }
        
        Integer imageStyle = userImageDetailRequest.getImage_style();
        // 不穿取默认style
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
