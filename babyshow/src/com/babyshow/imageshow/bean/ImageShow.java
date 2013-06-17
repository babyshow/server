/*
 * 文 件 名:  ImageShow.java
 * 描    述:  ImageShow.java
 * 时    间:  2013-6-17
 */
package com.babyshow.imageshow.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageShow
{
    /**
     * 展示ID
     */
    private String showID;
    
    /**
     * 照片ID
     */
    private String imageID;
    
    /**
     * 展示时间
     */
    private Date showTime;
    
    /**
     * 状态
     */
    private String status;
    
    /**
     * 获取 showID
     * 
     * @return 返回 showID
     */
    public String getShowID()
    {
        return showID;
    }
    
    /**
     * 设置 showID
     * 
     * @param 对showID进行赋值
     */
    public void setShowID(String showID)
    {
        this.showID = showID;
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
    
}
