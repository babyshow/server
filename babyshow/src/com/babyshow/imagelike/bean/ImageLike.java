/*
 * 文 件 名:  ImageLike.java
 * 描    述:  ImageLike.java
 * 时    间:  2013-6-17
 */
package com.babyshow.imagelike.bean;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageLike
{
    /**
     * 照片喜欢ID
     */
    private String likeID;
    
    /**
     * 照片ID
     */
    private String imageID;
    
    /**
     * 用户ID
     */
    private String userID;
    
    /**
     * 评价类型
     */
    private String likeType;
    
    /**
     * 获取 likeID
     * 
     * @return 返回 likeID
     */
    public String getLikeID()
    {
        return likeID;
    }
    
    /**
     * 设置 likeID
     * 
     * @param 对likeID进行赋值
     */
    public void setLikeID(String likeID)
    {
        this.likeID = likeID;
    }
    
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
     * 获取 likeType
     * 
     * @return 返回 likeType
     */
    public String getLikeType()
    {
        return likeType;
    }
    
    /**
     * 设置 likeType
     * 
     * @param 对likeType进行赋值
     */
    public void setLikeType(String likeType)
    {
        this.likeType = likeType;
    }
    
}
