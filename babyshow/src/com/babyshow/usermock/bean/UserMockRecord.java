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
    private String recordID;
    
    /**
     * �û�ID
     */
    private String userID;
    
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
    private String operatorID;
    
    /**
     * ��ȡ recordID
     * 
     * @return ���� recordID
     */
    public String getRecordID()
    {
        return recordID;
    }
    
    /**
     * ���� recordID
     * 
     * @param ��recordID���и�ֵ
     */
    public void setRecordID(String recordID)
    {
        this.recordID = recordID;
    }
    
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
    
}
