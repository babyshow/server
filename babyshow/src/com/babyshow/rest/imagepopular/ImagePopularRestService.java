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

/**
 * <һ�仰���ܼ���>
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
     * ��ѯ����չʾ��Ƭ
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
        // TODO url��Ҫ��ţ֧��
        imagePopularResponse.setImageUrl(image.getUrlKey());
        // TODO ���м���������Ҫ����
        imagePopularResponse.setLikeStatus(true);
        
        return imagePopularResponse;
    }
}
