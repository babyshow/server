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
    private String recordID;
    
    /**
     * 用户ID
     */
    private String userID;
    
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
    private String operatorID;
    
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
     * 获取 operatorID
     * 
     * @return 返回 operatorID
     */
    public String getOperatorID()
    {
        return operatorID;
    }
    
    /**
     * 设置 operatorID
     * 
     * @param 对operatorID进行赋值
     */
    public void setOperatorID(String operatorID)
    {
        this.operatorID = operatorID;
    }
    
}
