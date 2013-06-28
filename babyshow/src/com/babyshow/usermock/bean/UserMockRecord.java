/*
 * �� �� ��:  UserMockRecord.java
 * ��    ��:  UserMockRecord.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.usermock.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class UserMockRecord
{
    /**
     * ��¼ID
     */
    private Integer id;
    
    /**
     * �û�Code
     */
    private String userCode;
    
    /**
     * �޸�����
     */
    private String mockType;
    
    /**
     * �޸�ʱ��
     */
    private Date mockTime;
    
    /**
     * ����ԱID
     */
    private String operatorCode;
    
    /**
     * ��ȡ mockType
     * 
     * @return ���� mockType
     */
    public String getMockType()
    {
        return mockType;
    }
    
    /**
     * ���� mockType
     * 
     * @param ��mockType���и�ֵ
     */
    public void setMockType(String mockType)
    {
        this.mockType = mockType;
    }
    
    /**
     * ��ȡ mockTime
     * 
     * @return ���� mockTime
     */
    public Date getMockTime()
    {
        return mockTime;
    }
    
    /**
     * ���� mockTime
     * 
     * @param ��mockTime���и�ֵ
     */
    public void setMockTime(Date mockTime)
    {
        this.mockTime = mockTime;
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
     * ��ȡ operatorCode
     * 
     * @return ���� operatorCode
     */
    public String getOperatorCode()
    {
        return operatorCode;
    }
    
    /**
     * ���� operatorCode
     * 
     * @param ��operatorCode���и�ֵ
     */
    public void setOperatorCode(String operatorCode)
    {
        this.operatorCode = operatorCode;
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
    
}
