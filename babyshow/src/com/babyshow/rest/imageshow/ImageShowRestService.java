/*
 * �� �� ��:  ImageShowRestService.java
 * ��    ��:  ImageShowRestService.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.rest.imageshow;

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
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class ImageShowRestService extends RestService
{
    @Autowired
    private UserService userService;
    
    @Autowired
    private ImageService imageService;
    
    /**
     * 
     * ������Ƭ�鿴
     * 
     * @param imageShowRequest
     * @return
     */
    public ImageShowResponse handleImageShow(ImageShowRequest imageShowRequest)
    {
        ImageShowResponse imageShowResponse = new ImageShowResponse();
        String deviceID = imageShowRequest.getDevice_id();
        
        // У��ID�Ƿ����
        boolean userValidate = this.validateUser(deviceID, imageShowResponse);
        if(!userValidate)
        {
            imageShowResponse.setRequest("imageShowRequest");
            return imageShowResponse;
        }
        
        Integer count = imageShowRequest.getCount();
        if(count == null)
        {
            count = 1;
        }
        
        int imageStyle = imageShowRequest.getImage_style();       
        User user = this.userService.findUserByDeviceID(deviceID);
        String userCode = user.getUserCode();
        List<ImageShowResponseImage> imageShowResponseImageList = new ArrayList<ImageShowResponseImage>();
        List<Image> imageList = this.imageService.findRandomImageList(imageStyle, count);
        for(Image image : imageList)
        {
            ImageShowResponseImage imageShowResponseImage = new ImageShowResponseImage();
            imageShowResponseImage.setImage(image);
            // �û�����Ƭ���޹�ϵ
            boolean likeStatus = this.imageService.isImageLikeExist(userCode, image.getImageCode());
            imageShowResponseImage.setLikeStatus(likeStatus);
            imageShowResponseImageList.add(imageShowResponseImage);
        }
        
        imageShowResponse.setImageShowResponseImageList(imageShowResponseImageList);
        return imageShowResponse;
    }
    
}
