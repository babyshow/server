/*
 * 文 件 名:  ImageShowResponseImage.java
 * 描    述:  ImageShowResponseImage.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.imageshow;

import com.babyshow.image.bean.Image;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImageShowResponseImage
{
    /**
     * 照片ID
     */
    private Image image;
    
    /**
     * 该用户是否已赞这张照片
     */
    private boolean likeStatus;
    
    /**
     * 获取 image
     * 
     * @return 返回 image
     */
    public Image getImage()
    {
        return image;
    }
    
    /**
     * 设置 image
     * 
     * @param 对image进行赋值
     */
    public void setImage(Image image)
    {
        this.image = image;
    }
    
    /**
     * 获取 likeStatus
     * 
     * @return 返回 likeStatus
     */
    public boolean isLikeStatus()
    {
        return likeStatus;
    }
    
    /**
     * 设置 likeStatus
     * 
     * @param 对likeStatus进行赋值
     */
    public void setLikeStatus(boolean likeStatus)
    {
        this.likeStatus = likeStatus;
    }
}
