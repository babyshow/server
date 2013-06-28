/*
 * 文 件 名:  UserMockRecord.java
 * 描    述:  UserMockRecord.java
 * 时    间:  2013-6-17
 */
package com.babyshow.usermock.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class UserMockRecord
{
    /**
     * 记录ID
     */
    private Integer id;
    
    /**
     * 用户Code
     */
    private String userCode;
    
    /**
     * 修改类型
     */
    private String mockType;
    
    /**
     * 修改时间
     */
    private Date mockTime;
    
    /**
     * 操作员ID
     */
    private String operatorCode;
    
    /**
     * 获取 mockType
     * 
     * @return 返回 mockType
     */
    public String getMockType()
    {
        return mockType;
    }
    
    /**
     * 设置 mockType
     * 
     * @param 对mockType进行赋值
     */
    public void setMockType(String mockType)
    {
        this.mockType = mockType;
    }
    
    /**
     * 获取 mockTime
     * 
     * @return 返回 mockTime
     */
    public Date getMockTime()
    {
        return mockTime;
    }
    
    /**
     * 设置 mockTime
     * 
     * @param 对mockTime进行赋值
     */
    public void setMockTime(Date mockTime)
    {
        this.mockTime = mockTime;
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
