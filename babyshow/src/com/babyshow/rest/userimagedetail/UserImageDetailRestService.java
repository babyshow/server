/*
 * �� �� ��:  UserImageDetailRestService.java
 * ��    ��:  UserImageDetailRestService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.rest.userimagedetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;

/**
 * <һ�仰���ܼ���>
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
     * ��Ƭ����鿴
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
