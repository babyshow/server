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
     * ID
     */
    private Integer id;
    
    /**
     * �û�code
     */
    private String userCode;
    
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
     * ע�����
     */
    private Integer regNum;
    
    /**
     * �û�����
     */
    private String userType;
    
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
    
    /**
     * ��ȡ userCode
     * 
     * @return ���� userCode
     */
    public String getUserCode()
    {
        return userCode;
    }
    
    /**
     * ���� userCode
     * 
     * @param ��userCode���и�ֵ
     */
    public void setUserCode(String userCode)
    {
        this.userCode = userCode;
    }
    
    /**
     * ��ȡ id
     * 
     * @return ���� id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * ���� id
     * 
     * @param ��id���и�ֵ
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    /**
     * ��ȡ regNum
     * 
     * @return ���� regNum
     */
    public Integer getRegNum()
    {
        return regNum;
    }
    
    /**
     * ���� regNum
     * 
     * @param ��regNum���и�ֵ
     */
    public void setRegNum(Integer regNum)
    {
        this.regNum = regNum;
    }
    
}
