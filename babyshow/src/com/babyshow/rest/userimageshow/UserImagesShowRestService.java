/*
 * 文 件 名:  UserImagesShowRestService.java
 * 描    述:  UserImagesShowRestService.java
 * 时    间:  2013-6-30
 */
package com.babyshow.rest.userimageshow;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserImagesShowRestService extends RestService
{
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private UserService userService;
    
    /**
     * 
     * 处理用户照片查看
     * 
     * @param userImagesShowRequest
     * @return
     */
    public UserImagesShowResponse handleUserImagesShow(UserImagesShowRequest userImagesShowRequest)
    {
        UserImagesShowResponse userImagesShowResponse = new UserImagesShowResponse();
        Integer count = userImagesShowRequest.getCount();
        if(count == null)
        {
            count = 1;
        }
        
        String deviceID = userImagesShowRequest.getDevice_id();
        
        // 校验ID是否存在
        boolean userValidate = this.validateUser(deviceID, userImagesShowResponse);
        if(!userValidate)
        {
            userImagesShowResponse.setRequest("userImagesShowRequest");
            return userImagesShowResponse;
        }
        
        User user = this.userService.findUserByDeviceID(deviceID);
        String userCode = user.getUserCode();
        String sinceImageCode = userImagesShowRequest.getSince_image_id();
        
        // 校验图片是否存在
        boolean sinceImageValidate = this.validateImage(sinceImageCode, userImagesShowResponse);
        if(!sinceImageValidate)
        {
            userImagesShowResponse.setRequest("userImagesShowRequest");
            return userImagesShowResponse;
        }
        
        String maxImageCode = userImagesShowRequest.getMax_image_id();
        
        // 校验图片是否存在
        boolean maxImageValidate = this.validateImage(sinceImageCode, userImagesShowResponse);
        if(!maxImageValidate)
        {
            userImagesShowResponse.setRequest("userImagesShowRequest");
            return userImagesShowResponse;
        }
        
        List<Image> imageList = new ArrayList<Image>();
        List<UserImagesShowResponseImage> userImagesShowResponseImageList = new ArrayList<UserImagesShowResponseImage>();
        // TODO 这边的查询需要验证
        
        if (sinceImageCode != null)
        {
            imageList = this.imageService.findImageListBySinceImageCode(sinceImageCode, userCode, count);
            UserImagesShowResponseImage userImagesShowResponseImage = null;
            for (Image image : imageList)
            {
                userImagesShowResponseImage = new UserImagesShowResponseImage();
                userImagesShowResponseImage.setImage(image);
                // 用户和照片的赞关系
                boolean likeStatus = this.imageService.isImageLikeExist(userCode, image.getImageCode());
                userImagesShowResponseImage.setLikeStatus(likeStatus);
                userImagesShowResponseImageList.add(userImagesShowResponseImage);
            }
        }
        
        // TODO 这边的查询需要验证
        if (maxImageCode != null)
        {
            imageList = this.imageService.findImageListByMaxImageCode(sinceImageCode, userCode, count);
            UserImagesShowResponseImage userImagesShowResponseImage = null;
            for (Image image : imageList)
            {
                userImagesShowResponseImage = new UserImagesShowResponseImage();
                userImagesShowResponseImage.setImage(image);
                // 用户和照片的赞关系
                boolean likeStatus = this.imageService.isImageLikeExist(userCode, image.getImageCode());
                userImagesShowResponseImage.setLikeStatus(likeStatus);
                userImagesShowResponseImageList.add(userImagesShowResponseImage);
            }
        }
        userImagesShowResponse.setUserImageShowResponseImageList(userImagesShowResponseImageList);
        return userImagesShowResponse;
    }
}
