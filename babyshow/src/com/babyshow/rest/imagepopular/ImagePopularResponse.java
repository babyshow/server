/*
 * 文 件 名:  ImagePopularResponse.java
 * 描    述:  ImagePopularResponse.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.imagepopular;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImagePopularResponse extends RestResponse
{
    /**
     * 照片ID
     */
    @JsonProperty("image_id")
    private String imageID;
    
    /**
     * 照片路径
     */
    @JsonProperty("image_url")
    private String imageUrl;
    
    /**
     * 照片描述
     */
    @JsonProperty("image_description")
    private String imageDescription;
    
    /**
     * 照片创建时间
     */
    @JsonProperty("image_created_time")
    private String imageCreatedTime;
    
    /**
     * 照片被喜欢次数
     */
    @JsonProperty("image_like_count")
    private int imageLikeCount;
    
    /**
     * 该用户对照片的喜欢状态
     */
    @JsonProperty("like_status")
    private boolean likeStatus;
    
    /**
     * 获取 imageID
     * 
     * @return 返回 imageID
     */
    public String getImageID()
    {
        return imageID;
    }
    
    /**
     * 设置 imageID
     * 
     * @param 对imageID进行赋值
     */
    public void setImageID(String imageID)
    {
        this.imageID = imageID;
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
     * 获取 imageDescription
     * 
     * @return 返回 imageDescription
     */
    public String getImageDescription()
    {
        return imageDescription;
    }
    
    /**
     * 设置 imageDescription
     * 
     * @param 对imageDescription进行赋值
     */
    public void setImageDescription(String imageDescription)
    {
        this.imageDescription = imageDescription;
    }
    
    /**
     * 获取 imageCreatedTime
     * 
     * @return 返回 imageCreatedTime
     */
    public String getImageCreatedTime()
    {
        return imageCreatedTime;
    }
    
    /**
     * 设置 imageCreatedTime
     * 
     * @param 对imageCreatedTime进行赋值
     */
    public void setImageCreatedTime(String imageCreatedTime)
    {
        this.imageCreatedTime = imageCreatedTime;
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
