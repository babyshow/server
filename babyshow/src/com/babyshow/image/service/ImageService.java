/*
 * �� �� ��:  ImageService.java
 * ��    ��:  ImageService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.image.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.ImageStaticConstant;
import com.babyshow.image.bean.Image;
import com.babyshow.image.bean.ImageLike;
import com.babyshow.image.bean.ImagePopular;
import com.babyshow.image.dao.ImageDao;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class ImageService
{
    @Autowired
    private ImageDao imageDao;
    
    /**
     * ������ƬID��ѯ��Ƭ
     * 
     * @param imageID
     * @param imageStyle
     * @return
     */
    public Image findImageByImageCode(String imageCode, int imageStyle)
    {
        Image image = this.imageDao.findImageByImageCode(imageCode);
        // TODO ����Image�е�urlKey��imageStyleȥ��ţ��������ȡͼƬURL
        return image;
    }
    
    /**
     * 
     * ����Ƭ/ȡ������Ƭ
     * 
     * @param imageLike
     */
    public void InsertImageLike(ImageLike imageLike)
    {
        Date date = new Date();
        imageLike.setLikeTime(date);
        this.imageDao.insertImageLike(imageLike);
    }
    
    /**
     * 
     * ������Ƭ����ɾ����Ƭ
     * 
     * @param imageCode
     */
    public void deleleImageByImageCode(String imageCode)
    {
        this.imageDao.deleleImageByImageCode(imageCode);
    }
    
    /**
     * ��ѯչʾ��Ƭ
     * 
     * @param status
     * @return
     */
    public ImagePopular findImagePopular()
    {
        return this.imageDao.findImagePopular(ImageStaticConstant.IMAGE_POPULAR_STATUS_NORMAL);
    }
    
    /**
     * 
     * ��ѯ��sinceImageCode���������userCode����Ƭnum����Ƭ
     * 
     * @param sinceImageCode
     * @param userCode
     * @param limit
     * @return
     */
    public List<Image> findImageListBySinceImageCode(String sinceImageCode, String userCode, int num)
    {
        int limit = this.imageDao.findImageCountBySinceImageCode(sinceImageCode, userCode);
        return this.imageDao.findImageListBySinceImageCode(sinceImageCode, userCode, limit, num);
    }
    
    
    /**
     * 
     * ��ѯ��maxImageCode���������userCode����Ƭnum����Ƭ
     * 
     * @param sinceImageCode
     * @param userCode
     * @param limit
     * @return
     */
    public List<Image> findImageListByMaxImageCode(String sinceImageCode, String userCode, int num)
    {
        int limit = this.imageDao.findImageCountByMaxImageCode(sinceImageCode, userCode);
        return this.imageDao.findImageListByMaxImageCode(sinceImageCode, userCode, limit, num);
    }
}
