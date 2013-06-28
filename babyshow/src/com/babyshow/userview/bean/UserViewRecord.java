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
    private Integer id;
    
    /**
     * 用户ID
     */
    private String userCode;
    
    /**
     * 照片ID
     */
    private String imageCode;
    
    /**
     * 访问时间
     */
    private Date viewTime;
    
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
}
