/*
 * �� �� ��:  UserImageLikeRestService.java
 * ��    ��:  UserImageLikeRestService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.rest.userimagelike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.ImageLike;
import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserImageLikeRestService extends RestService
{
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private UserService userService;
    
    public UserImageLikeResponse handleUserImageLike(UserImageLikeRequest userImageLikeRequest)
    {
        UserImageLikeResponse userImageLikeResponse = new UserImageLikeResponse();
        String deviceID = userImageLikeRequest.getDevice_id();
        
        // У��ID�Ƿ����
        boolean userValidate = this.validateUser(deviceID, userImageLikeResponse);
        if(!userValidate)
        {
            userImageLikeResponse.setRequest("userImageLikeRequest");
            return userImageLikeResponse;
        }
        
        String imageCode = userImageLikeRequest.getImage_id();
        // У��ͼƬ�Ƿ����
        boolean imageValidate = this.validateImage(imageCode, userImageLikeResponse);
        if(!imageValidate)
        {
            userImageLikeResponse.setRequest("userImageLikeRequest");
            return userImageLikeResponse;
        }
        
        int likeType = userImageLikeRequest.getLike_type();
        User user = this.userService.findUserByDeviceID(deviceID);
        String userCode = user.getUserCode();

        ImageLike imageLike = new ImageLike();
        imageLike.setImageCode(imageCode);
        imageLike.setUserCode(userCode);
        imageLike.setLikeType(likeType);
        this.imageService.InsertImageLike(imageLike);
        return userImageLikeResponse;
    }

}
