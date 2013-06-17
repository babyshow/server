/*
 * �� �� ��:  User.java
 * ��    ��:  User.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.user.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class User
{
    /**
     * �û�ID
     */
    private String userID;
    
    /**
     * �û�״̬
     */
    private String status;
    
    /**
     * �û��豸id
     */
    private String deviceID;
    
    /**
     * ע��ʱ��
     */
    private Date regTime;
    
    /**
     * �û�����
     */
    private String userType;
    
    /**
     * ��ȡ userID
     * 
     * @return ���� userID
     */
    public String getUserID()
    {
        return userID;
    }
    
    /**
     * ���� userID
     * 
     * @param ��userID���и�ֵ
     */
    public void setUserID(String userID)
    {
        this.userID = userID;
    }
    
    /**
     * ��ȡ status
     * 
     * @return ���� status
     */
    public String getStatus()
    {
        return status;
    }
    
    /**
     * ���� status
     * 
     * @param ��status���и�ֵ
     */
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    /**
     * ��ȡ deviceID
     * 
     * @return ���� deviceID
     */
    public String getDeviceID()
    {
        return deviceID;
    }
    
    /**
     * ���� deviceID
     * 
     * @param ��deviceID���и�ֵ
     */
    public void setDeviceID(String deviceID)
    {
        this.deviceID = deviceID;
    }
    
    /**
     * ��ȡ regTime
     * 
     * @return ���� regTime
     */
    public Date getRegTime()
    {
        return regTime;
    }
    
    /**
     * ���� regTime
     * 
     * @param ��regTime���и�ֵ
     */
    public void setRegTime(Date regTime)
    {
        this.regTime = regTime;
    }
    
    /**
     * ��ȡ userType
     * 
     * @return ���� userType
     */
    public String getUserType()
    {
        return userType;
    }
    
    /**
     * ���� userType
     * 
     * @param ��userType���и�ֵ
     */
    public void setUserType(String userType)
    {
        this.userType = userType;
    }
    
}
