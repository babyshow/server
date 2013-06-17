/*
 * 文 件 名:  Image.java
 * 描    述:  Image.java
 * 时    间:  2013-6-17
 */
package com.babyshow.image.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class Image
{
    /**
     * 照片ID
     */
    private String imageID;
    
    /**
     * 所属用户ID
     */
    private String userID;
    
    /**
     * 照片描述
     */
    private String description;
    
    /**
     * 创建时间
     */
    private Date createdTime;
    
    /**
     * 照片对应云存储Key
     */
    private String urlKey;
    
    /**
     * 照片状态
     */
    private String status;
    
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
     * 获取 userID
     * 
     * @return 返回 userID
     */
    public String getUserID()
    {
        return userID;
    }
    
    /**
     * 设置 userID
     * 
     * @param 对userID进行赋值
     */
    public void setUserID(String userID)
    {
        this.userID = userID;
    }
    
    /**
     * 获取 description
     * 
     * @return 返回 description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * 设置 description
     * 
     * @param 对description进行赋值
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * 获取 createdTime
     * 
     * @return 返回 createdTime
     */
    public Date getCreatedTime()
    {
        return createdTime;
    }
    
    /**
     * 设置 createdTime
     * 
     * @param 对createdTime进行赋值
     */
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }
    
    /**
     * 获取 urlKey
     * 
     * @return 返回 urlKey
     */
    public String getUrlKey()
    {
        return urlKey;
    }
    
    /**
     * 设置 urlKey
     * 
     * @param 对urlKey进行赋值
     */
    public void setUrlKey(String urlKey)
    {
        this.urlKey = urlKey;
    }
    
    /**
     * 获取 status
     * 
     * @return 返回 status
     */
    public String getStatus()
    {
        return status;
    }
    
    /**
     * 设置 status
     * 
     * @param 对status进行赋值
     */
    public void setStatus(String status)
    {
        this.status = status;
    }
    
}
