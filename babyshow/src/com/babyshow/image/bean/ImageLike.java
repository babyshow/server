/*
 * 文 件 名:  ImageLike.java
 * 描    述:  ImageLike.java
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
public class ImageLike
{
    /**
     * 照片喜欢ID
     */
    private Integer id;
    
    /**
     * 照片ID
     */
    private String imageCode;
    
    /**
     * 用户ID
     */
    private String userCode;
    
    /**
     * 评价类型
     */
    private Integer likeType;
    
    /**
     * 评价时间
     */
    private Date likeTime;
    
    /**
     * 获取 id
     * 
     * @return 返回 id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * 设置 id
     * 
     * @param 对id进行赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    /**
     * 获取 imageCode
     * 
     * @return 返回 imageCode
     */
    public String getImageCode()
    {
        return imageCode;
    }
    
    /**
     * 设置 imageCode
     * 
     * @param 对imageCode进行赋值
     */
    public void setImageCode(String imageCode)
    {
        this.imageCode = imageCode;
    }
    
    /**
     * 获取 userCode
     * 
     * @return 返回 userCode
     */
    public String getUserCode()
    {
        return userCode;
    }
    
    /**
     * 设置 userCode
     * 
     * @param 对userCode进行赋值
     */
    public void setUserCode(String userCode)
    {
        this.userCode = userCode;
    }
    
    /**
     * 获取 likeType
     * 
     * @return 返回 likeType
     */
    public Integer getLikeType()
    {
        return likeType;
    }
    
    /**
     * 设置 likeType
     * 
     * @param 对likeType进行赋值
     */
    public void setLikeType(Integer likeType)
    {
        this.likeType = likeType;
    }
    
    /**
     * 获取 likeTime
     * 
     * @return 返回 likeTime
     */
    public Date getLikeTime()
    {
        return likeTime;
    }
    
    /**
     * 设置 likeTime
     * 
     * @param 对likeTime进行赋值
     */
    public void setLikeTime(Date likeTime)
    {
        this.likeTime = likeTime;
    }
    
}
