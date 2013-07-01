/*
 * �� �� ��:  UserLoginLog.java
 * ��    ��:  UserLoginLog.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.user.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
public class UserLoginLog
{
    /**
     * ��¼��¼ID
     */
    private Integer id;
    
    /**
     * �û�code
     */
    private String userCode;
    
    /**
     * ��¼ʱ��
     */
    private Date loginTime;
    
    /**
     * ��¼IP
     */
    private String loginIP;
    
    /**
     * ��ע
     */
    private String remark;
    
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
     * ��ȡ loginTime
     * 
     * @return ���� loginTime
     */
    public Date getLoginTime()
    {
        return loginTime;
    }
    
    /**
     * ���� loginTime
     * 
     * @param ��loginTime���и�ֵ
     */
    public void setLoginTime(Date loginTime)
    {
        this.loginTime = loginTime;
    }
    
    /**
     * ��ȡ loginIP
     * 
     * @return ���� loginIP
     */
    public String getLoginIP()
    {
        return loginIP;
    }
    
    /**
     * ���� loginIP
     * 
     * @param ��loginIP���и�ֵ
     */
    public void setLoginIP(String loginIP)
    {
        this.loginIP = loginIP;
    }
    
    /**
     * ��ȡ remark
     * 
     * @return ���� remark
     */
    public String getRemark()
    {
        return remark;
    }
    
    /**
     * ���� remark
     * 
     * @param ��remark���и�ֵ
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
}
