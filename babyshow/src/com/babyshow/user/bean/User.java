/*
 * 文 件 名:  User.java
 * 描    述:  User.java
 * 时    间:  2013-6-17
 */
package com.babyshow.user.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class User
{
    /**
     * 用户ID
     */
    private String userID;
    
    /**
     * 用户状态
     */
    private String status;
    
    /**
     * 用户设备id
     */
    private String deviceID;
    
    /**
     * 注册时间
     */
    private Date regTime;
    
    /**
     * 用户类型
     */
    private String userType;
    
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
     * 获取 deviceID
     * 
     * @return 返回 deviceID
     */
    public String getDeviceID()
    {
        return deviceID;
    }
    
    /**
     * 设置 deviceID
     * 
     * @param 对deviceID进行赋值
     */
    public void setDeviceID(String deviceID)
    {
        this.deviceID = deviceID;
    }
    
    /**
     * 获取 regTime
     * 
     * @return 返回 regTime
     */
    public Date getRegTime()
    {
        return regTime;
    }
    
    /**
     * 设置 regTime
     * 
     * @param 对regTime进行赋值
     */
    public void setRegTime(Date regTime)
    {
        this.regTime = regTime;
    }
    
    /**
     * 获取 userType
     * 
     * @return 返回 userType
     */
    public String getUserType()
    {
        return userType;
    }
    
    /**
     * 设置 userType
     * 
     * @param 对userType进行赋值
     */
    public void setUserType(String userType)
    {
        this.userType = userType;
    }
    
}
