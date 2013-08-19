/*
 * �� �� ��:  ImagePopularRestService.java
 * ��    ��:  ImagePopularRestService.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.rest.imagepopular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.bean.ImagePopular;
import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;
import com.babyshow.util.DateUtil;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class ImagePopularRestService extends RestService
{
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private UserService userService;
    
    /**
     * ��ѯ����չʾ��Ƭ
     * 
     * @param imagePopularRequest
     * @return
     */
    public ImagePopularResponse handleImagePopular(ImagePopularRequest imagePopularRequest)
    {
        ImagePopularResponse imagePopularResponse = new ImagePopularResponse();
        String deviceID = imagePopularRequest.getDevice_id();
        
        // У��ID�Ƿ����
        boolean userValidate = this.validateUser(deviceID, imagePopularResponse);
        if(!userValidate)
        {
            imagePopularResponse.setRequest("imagePopularRequest");
            return imagePopularResponse;
        }
        
        int imageStyle = imagePopularRequest.getImage_style();

        ImagePopular imagePopular = imageService.findImagePopular();
        String imageCode = imagePopular.getImageCode();
        imagePopularResponse.setImageID(imagePopular.getImageCode());
        Image image = this.imageService.findImageByImageCode(imageCode, imageStyle);
        
        imagePopularResponse.setImageUrl(image.getUrl());
        imagePopularResponse.setImageCreatedTime(DateUtil.dateTo14String(image.getCreatedTime()));
        imagePopularResponse.setImageLikeCount(image.getLikeCount());
        imagePopularResponse.setImageDescription(image.getDescription());
        
        User user = this.userService.findUserByDeviceID(deviceID);
        String userCode = user.getUserCode();
        boolean likeStatus = this.imageService.isImageLikeExist(userCode, imageCode);
        imagePopularResponse.setLikeStatus(likeStatus);
        return imagePopularResponse;
    }
}
