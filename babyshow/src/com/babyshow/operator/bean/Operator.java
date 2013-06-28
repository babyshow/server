/*
 * 文 件 名:  Operator.java
 * 描    述:  Operator.java
 * 时    间:  2013-6-17
 */
package com.babyshow.operator.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class Operator
{
    
    private Integer id;
    
    /**
     * 操作员code
     */
    private String operatorCode;
    
    /**
     * 登录名
     */
    private String loginName;
    
    /**
     * 密码
     */
    private String password;
    
    /**
     * 用户状态
     */
    private String status;
    
    /**
     * 最后登录时间
     */
    private Date lastActTime;
    
    /**
     * 获取 loginName
     * 
     * @return 返回 loginName
     */
    public String getLoginName()
    {
        return loginName;
    }
    
    /**
     * 设置 loginName
     * 
     * @param 对loginName进行赋值
     */
    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }
    
    /**
     * 获取 password
     * 
     * @return 返回 password
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * 设置 password
     * 
     * @param 对password进行赋值
     */
    public void setPassword(String password)
    {
        this.password = password;
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
     * 获取 lastActTime
     * 
     * @return 返回 lastActTime
     */
    public Date getLastActTime()
    {
        return lastActTime;
    }
    
    /**
     * 设置 lastActTime
     * 
     * @param 对lastActTime进行赋值
     */
    public void setLastActTime(Date lastActTime)
    {
        this.lastActTime = lastActTime;
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
     * 获取 operatorCode
     * 
     * @return 返回 operatorCode
     */
    public String getOperatorCode()
    {
        return operatorCode;
    }
    
    /**
     * 设置 operatorCode
     * 
     * @param 对operatorCode进行赋值
     */
    public void setOperatorCode(String operatorCode)
    {
        this.operatorCode = operatorCode;
    }
    
}
