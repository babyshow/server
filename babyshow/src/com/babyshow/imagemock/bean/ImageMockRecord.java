/*
 * 文 件 名:  ImageMockRecord.java
 * 描    述:  ImageMockRecord.java
 * 时    间:  2013-6-17
 */
package com.babyshow.imagemock.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageMockRecord
{
    /**
     * 记录ID
     */
    private String recordID;
    
    /**
     * 照片ID
     */
    private String imageID;
    
    /**
     * 修改时间
     */
    private Date mockTime;
    
    /**
     * 修改值
     */
    private int mockValue;
    
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
     * 获取 imageID
     * 
     * @return 返回 imageID
     */
    public String getImageID()
    {
        return imageID;
    }
    
    /**
     * 设置 imageID
     * 
     * @param 对imageID进行赋值
     */
    public void setImageID(String imageID)
    {
        this.imageID = imageID;
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
     * 获取 mockValue
     * 
     * @return 返回 mockValue
     */
    public int getMockValue()
    {
        return mockValue;
    }
    
    /**
     * 设置 mockValue
     * 
     * @param 对mockValue进行赋值
     */
    public void setMockValue(int mockValue)
    {
        this.mockValue = mockValue;
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
