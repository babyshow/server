/*
 * 文 件 名:  UserViewRecord.java
 * 描    述:  UserViewRecord.java
 * 时    间:  2013-6-17
 */
package com.babyshow.userview.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class UserViewRecord
{
    /**
     * 访问记录ID
     */
    private String recordID;
    
    /**
     * 用户ID
     */
    private String userID;
    
    /**
     * 照片ID
     */
    private String imageID;
    
    /**
     * 访问时间
     */
    private Date viewTime;
    
    /**
     * 获取 recordID
     * 
     * @return 返回 recordID
     */
    public String getRecordID()
    {
        return recordID;
    }
    
    /**
     * 设置 recordID
     * 
     * @param 对recordID进行赋值
     */
    public void setRecordID(String recordID)
    {
        this.recordID = recordID;
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
     * 获取 viewTime
     * 
     * @return 返回 viewTime
     */
    public Date getViewTime()
    {
        return viewTime;
    }
    
    /**
     * 设置 viewTime
     * 
     * @param 对viewTime进行赋值
     */
    public void setViewTime(Date viewTime)
    {
        this.viewTime = viewTime;
    }
}
