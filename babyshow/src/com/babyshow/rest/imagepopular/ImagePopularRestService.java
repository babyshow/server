/*
 * 文 件 名:  ImagePopularRestService.java
 * 描    述:  ImagePopularRestService.java
 * 时    间:  2013-7-1
 */
package com.babyshow.rest.imagepopular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.bean.ImagePopular;
import com.babyshow.image.service.ImageService;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class ImagePopularRestService
{
    @Autowired
    private ImageService imageService;
    
    /**
     * 查询公共展示照片
     * 
     * @param imagePopularRequest
     * @return
     */
    public ImagePopularResponse handleImagePopular(ImagePopularRequest imagePopularRequest)
    {
        int imageStyle = imagePopularRequest.getImage_style();
        ImagePopularResponse imagePopularResponse = new ImagePopularResponse();
        ImagePopular imagePopular = imageService.findImagePopular();
        String imageCode = imagePopular.getImageCode();
        imagePopularResponse.setImageID(imagePopular.getImageCode());
        Image image = this.imageService.findImageByImageCode(imageCode, imageStyle);
        // TODO url需要七牛支持
        imagePopularResponse.setImageUrl(image.getUrlKey());
        // TODO 还有几个参数需要完善
        imagePopularResponse.setLikeStatus(true);
        
        return imagePopularResponse;
    }
}
