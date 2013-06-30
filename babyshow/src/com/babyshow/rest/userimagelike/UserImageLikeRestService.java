/*
 * 文 件 名:  UserImageLikeRestService.java
 * 描    述:  UserImageLikeRestService.java
 * 时    间:  2013-6-30
 */
package com.babyshow.rest.userimagelike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.ImageLike;
import com.babyshow.image.service.ImageService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserImageLikeRestService
{
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private UserService userService;
    
    public UserImageLikeResponse handleUserImageLike(UserImageLikeRequest userImageLikeRequest)
    {
        String imageCode = userImageLikeRequest.getImage_id();
        String deviceID = userImageLikeRequest.getDevice_id();
        int likeType = userImageLikeRequest.getLike_type();
        User user = this.userService.findUserByDeviceID(deviceID);
        String userCode = user.getUserCode();
        UserImageLikeResponse userImageLikeResponse = new UserImageLikeResponse();
        ImageLike imageLike = new ImageLike();
        imageLike.setImageCode(imageCode);
        imageLike.setUserCode(userCode);
        imageLike.setLikeType(likeType);
        this.imageService.InsertImageLike(imageLike);
        return userImageLikeResponse;
    }

}
