/*
 * �� �� ��:  UserImagesShowRestService.java
 * ��    ��:  UserImagesShowRestService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.rest.userimageshow;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserImagesShowRestService
{
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private UserService userService;
    
    /**
     * 
     * �����û���Ƭ�鿴
     * 
     * @param userImagesShowRequest
     * @return
     */
    public UserImagesShowResponse handleUserImagesShow(UserImagesShowRequest userImagesShowRequest)
    {
        UserImagesShowResponse userImagesShowResponse = new UserImagesShowResponse();
        int num = userImagesShowRequest.getCount();
        String deviceID = userImagesShowRequest.getDevice_id();
        User user = this.userService.findUserByDeviceID(deviceID);
        String userCode = user.getUserCode();
        String sinceImageCode = userImagesShowRequest.getSince_image_id();
        String maxImageCode = userImagesShowRequest.getMax_image_id();
        List<Image> imageList = new ArrayList<Image>();
        List<UserImagesShowResponseImage> userImagesShowResponseImageList = new ArrayList<UserImagesShowResponseImage>();
        // TODO ��ߵĲ�ѯ��Ҫ��֤
        
        if (sinceImageCode != null)
        {
            imageList = this.imageService.findImageListBySinceImageCode(sinceImageCode, userCode, num);
            UserImagesShowResponseImage userImagesShowResponseImage = null;
            for (Image image : imageList)
            {
                userImagesShowResponseImage = new UserImagesShowResponseImage();
                userImagesShowResponseImage.setImage(image);
                // �û�����Ƭ���޹�ϵ
                boolean likeStatus = this.imageService.isImageLikeExist(userCode, image.getImageCode());
                userImagesShowResponseImage.setLikeStatus(likeStatus);
                userImagesShowResponseImageList.add(userImagesShowResponseImage);
            }
        }
        
        // TODO ��ߵĲ�ѯ��Ҫ��֤
        if (maxImageCode != null)
        {
            imageList = this.imageService.findImageListByMaxImageCode(sinceImageCode, userCode, num);
            UserImagesShowResponseImage userImagesShowResponseImage = null;
            for (Image image : imageList)
            {
                userImagesShowResponseImage = new UserImagesShowResponseImage();
                userImagesShowResponseImage.setImage(image);
                // �û�����Ƭ���޹�ϵ
                boolean likeStatus = this.imageService.isImageLikeExist(userCode, image.getImageCode());
                userImagesShowResponseImage.setLikeStatus(likeStatus);
                userImagesShowResponseImageList.add(userImagesShowResponseImage);
            }
        }
        userImagesShowResponse.setUserImageShowResponseImageList(userImagesShowResponseImageList);
        return userImagesShowResponse;
    }
}
