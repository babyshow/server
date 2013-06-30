/*
 * 文 件 名:  ImageService.java
 * 描    述:  ImageService.java
 * 时    间:  2013-6-30
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
 * <一句话功能简述>
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
     * 根据照片ID查询照片
     * 
     * @param imageID
     * @param imageStyle
     * @return
     */
    public Image findImageByImageCode(String imageCode, int imageStyle)
    {
        Image image = this.imageDao.findImageByImageCode(imageCode);
        // TODO 根据Image中的urlKey和imageStyle去七牛服务器提取图片URL
        return image;
    }
    
    /**
     * 
     * 赞照片/取消赞照片
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
     * 根据照片代码删除照片
     * 
     * @param imageCode
     */
    public void deleleImageByImageCode(String imageCode)
    {
        this.imageDao.deleleImageByImageCode(imageCode);
    }
    
    /**
     * 查询展示照片
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
     * 查询比sinceImageCode发布的晚的userCode的照片num张照片
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
     * 查询比maxImageCode发布的早的userCode的照片num张照片
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
