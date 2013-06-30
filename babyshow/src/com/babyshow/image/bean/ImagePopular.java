/*
 * 文 件 名:  ImagePopular.java
 * 描    述:  ImagePopular.java
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
public class ImagePopular
{
    /**
     * 展示ID
     */
    private Integer id;
    
    /**
     * 照片ID
     */
    private String imageCode;
    
    /**
     * 展示时间
     */
    private Date showTime;
    
    /**
     * 状态
     */
    private String status;
    
    /**
     * 获取 showTime
     * 
     * @return 返回 showTime
     */
    public Date getShowTime()
    {
        return showTime;
    }
    
    /**
     * 设置 showTime
     * 
     * @param 对showTime进行赋值
     */
    public void setShowTime(Date showTime)
    {
        this.showTime = showTime;
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
    
}
