/*
 * �� �� ��:  Operator.java
 * ��    ��:  Operator.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.operator.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class Operator
{
    /**
     * ����ԱID
     */
    private String operatorID;
    
    /**
     * ��¼��
     */
    private String loginName;
    
    /**
     * ����
     */
    private String password;
    
    /**
     * �û�״̬
     */
    private String status;
    
    /**
     * ����¼ʱ��
     */
    private Date lastActTime;
    
    /**
     * ��ȡ operatorID
     * 
     * @return ���� operatorID
     */
    public String getOperatorID()
    {
        return operatorID;
    }
    
    /**
     * ���� operatorID
     * 
     * @param ��operatorID���и�ֵ
     */
    public void setOperatorID(String operatorID)
    {
        this.operatorID = operatorID;
    }
    
    /**
     * ��ȡ loginName
     * 
     * @return ���� loginName
     */
    public String getLoginName()
    {
        return loginName;
    }
    
    /**
     * ���� loginName
     * 
     * @param ��loginName���и�ֵ
     */
    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }
    
    /**
     * ��ȡ password
     * 
     * @return ���� password
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * ���� password
     * 
     * @param ��password���и�ֵ
     */
    public void setPassword(String password)
    {
        this.password = password;
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
     * ��ȡ lastActTime
     * 
     * @return ���� lastActTime
     */
    public Date getLastActTime()
    {
        return lastActTime;
    }
    
    /**
     * ���� lastActTime
     * 
     * @param ��lastActTime���и�ֵ
     */
    public void setLastActTime(Date lastActTime)
    {
        this.lastActTime = lastActTime;
    }
    
}
