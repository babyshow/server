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
    private Integer id;
    
    /**
     * ��Ƭcode
     */
    private String imageCode;
    
    /**
     * �޸�ʱ��
     */
    private Date mockTime;
    
    /**
     * �޸�ֵ
     */
    private int mockValue;
    
    /**
     * ����ԱCode
     */
    private String operatorCode;
    
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
     * ��ȡ imageCode
     * 
     * @return ���� imageCode
     */
    public String getImageCode()
    {
        return imageCode;
    }
    
    /**
     * ���� imageCode
     * 
     * @param ��imageCode���и�ֵ
     */
    public void setImageCode(String imageCode)
    {
        this.imageCode = imageCode;
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
    
}
