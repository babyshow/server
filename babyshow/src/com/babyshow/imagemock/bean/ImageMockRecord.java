/*
 * �� �� ��:  ImageMockRecord.java
 * ��    ��:  ImageMockRecord.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.imagemock.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageMockRecord
{
    /**
     * ��¼ID
     */
    private String recordID;
    
    /**
     * ��ƬID
     */
    private String imageID;
    
    /**
     * �޸�ʱ��
     */
    private Date mockTime;
    
    /**
     * �޸�ֵ
     */
    private int mockValue;
    
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
     * ��ȡ imageID
     * 
     * @return ���� imageID
     */
    public String getImageID()
    {
        return imageID;
    }
    
    /**
     * ���� imageID
     * 
     * @param ��imageID���и�ֵ
     */
    public void setImageID(String imageID)
    {
        this.imageID = imageID;
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
     * ��ȡ mockValue
     * 
     * @return ���� mockValue
     */
    public int getMockValue()
    {
        return mockValue;
    }
    
    /**
     * ���� mockValue
     * 
     * @param ��mockValue���и�ֵ
     */
    public void setMockValue(int mockValue)
    {
        this.mockValue = mockValue;
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
