/*
 * 文 件 名:  UserImagesShowResponseImage.java
 * 描    述:  UserImagesShowResponseImage.java
 * 时    间:  2013-6-20
 */
package com.babyshow.rest.userimageshow;

import com.babyshow.image.bean.Image;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserImagesShowResponseImage
{
    
    /**
     * 照片ID
     */
    private Image image;
    
    /**
     * 照片Url
     */
    private String imageUrl;
    
    /**
     * 照片喜欢次数
     */
    private int imageLikeCount;
    
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
     * 获取 imageUrl
     * 
     * @return 返回 imageUrl
     */
    public String getImageUrl()
    {
        return imageUrl;
    }
    
    /**
     * 设置 imageUrl
     * 
     * @param 对imageUrl进行赋值
     */
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }
    
    /**
     * 获取 imageLikeCount
     * 
     * @return 返回 imageLikeCount
     */
    public int getImageLikeCount()
    {
        return imageLikeCount;
    }
    
    /**
     * 设置 imageLikeCount
     * 
     * @param 对imageLikeCount进行赋值
     */
    public void setImageLikeCount(int imageLikeCount)
    {
        this.imageLikeCount = imageLikeCount;
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
