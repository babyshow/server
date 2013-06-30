/*
 * 文 件 名:  UserLoginLog.java
 * 描    述:  UserLoginLog.java
 * 时    间:  2013-6-30
 */
package com.babyshow.user.bean;

import java.util.Date;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
public class UserLoginLog
{
    /**
     * 登录记录ID
     */
    private Integer id;
    
    /**
     * 用户code
     */
    private String userCode;
    
    /**
     * 登录时间
     */
    private Date loginTime;
    
    /**
     * 登录IP
     */
    private String loginIP;
    
    /**
     * 备注
     */
    private String remark;
    
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
     * 获取 loginTime
     * 
     * @return 返回 loginTime
     */
    public Date getLoginTime()
    {
        return loginTime;
    }
    
    /**
     * 设置 loginTime
     * 
     * @param 对loginTime进行赋值
     */
    public void setLoginTime(Date loginTime)
    {
        this.loginTime = loginTime;
    }
    
    /**
     * 获取 loginIP
     * 
     * @return 返回 loginIP
     */
    public String getLoginIP()
    {
        return loginIP;
    }
    
    /**
     * 设置 loginIP
     * 
     * @param 对loginIP进行赋值
     */
    public void setLoginIP(String loginIP)
    {
        this.loginIP = loginIP;
    }
    
    /**
     * 获取 remark
     * 
     * @return 返回 remark
     */
    public String getRemark()
    {
        return remark;
    }
    
    /**
     * 设置 remark
     * 
     * @param 对remark进行赋值
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
}
