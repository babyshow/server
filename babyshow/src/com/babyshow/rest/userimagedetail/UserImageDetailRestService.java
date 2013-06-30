/*
 * 文 件 名:  UserImageDetailRestService.java
 * 描    述:  UserImageDetailRestService.java
 * 时    间:  2013-6-30
 */
package com.babyshow.rest.userimagedetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserImageDetailRestService
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
        String imageCode = userImageDetailRequest.getImage_id();
        int imageStyle = userImageDetailRequest.getImage_style();
        Image image = this.imageService.findImageByImageCode(imageCode, imageStyle);
        UserImageDetailResponse userImageDetailResponse = new UserImageDetailResponse();
        String imageUrl = image.getUrlKey();
        userImageDetailResponse.setImageUrl(imageUrl);
        return userImageDetailResponse;
    }
}
