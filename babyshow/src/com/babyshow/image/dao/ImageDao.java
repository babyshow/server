/*
 * 文 件 名:  ImageDao.java
 * 描    述:  ImageDao.java
 * 时    间:  2013-6-30
 */
package com.babyshow.image.dao;

import java.util.List;

import com.babyshow.image.bean.Image;
import com.babyshow.image.bean.ImageLike;
import com.babyshow.image.bean.ImagePopular;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
public interface ImageDao
{
    /**
     * 
     * 根据照片ID查询照片
     * 
     * @param imageID
     * @return
     */
    public Image findImageByImageCode(String imageCode);
    
    /**
     * 
     * 写入图片
     * 
     * @param image
     */
    public void insertImage(Image image);
    
    /**
     * 
     * 写入赞照片状态
     * 
     * @param imageLike
     */
    public void insertImageLike(ImageLike imageLike);
    
    /**
     * 
     * 根据照片代码删除照片
     * 
     * @param imageCode
     */
    public void deleleImageByImageCode(String imageCode);
    
    /**
     * 根据展示状态查询展示照片
     * 
     * @param status
     * @return
     */
    public ImagePopular findImagePopular(int status);
    
    /**
     * 
     * 查询比sinceImageCode发布的晚的userCode的照片总数 （刷新新鲜事使用）
     * 
     * @param sinceImageCode
     * @return
     */
    public int findImageCountBySinceImageCode(String sinceImageCode, String userCode);
    
    /**
     * 
     * 查询比sinceImageCode发布的晚的userCode的照片num张照片
     * 
     * @param sinceImageCode
     * @param userCode
     * @param limit 游标开始数
     * @param num 需取得照片数
     * @return
     */
    public List<Image> findImageListBySinceImageCode(String sinceImageCode, String userCode, int limit, int num);
    
    
    /**
     * 
     * 查询比maxImageCode发布的早的userCode的照片总数 
     * 
     * @param sinceImageCode
     * @return
     */
    public int findImageCountByMaxImageCode(String maxImageCode, String userCode);
    
    
    /**
     * 
     * 查询比maxImageCode发布早的userCode的照片num张照片
     * 
     * @param maxImageCode
     * @param userCode
     * @param limit 游标开始数
     * @param num 需取得照片数
     * @return
     */
    public List<Image> findImageListByMaxImageCode(String maxImageCode, String userCode, int limit, int num);
}
