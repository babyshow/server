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
    private Integer id;
    
    /**
     * 照片code
     */
    private String imageCode;
    
    /**
     * 修改时间
     */
    private Date mockTime;
    
    /**
     * 修改值
     */
    private int mockValue;
    
    /**
     * 操作员Code
     */
    private String operatorCode;
    
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
     * 获取 id
     * 
     * @return 返回 id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * 设置 id
     * 
     * @param 对id进行赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    /**
     * 获取 imageCode
     * 
     * @return 返回 imageCode
     */
    public String getImageCode()
    {
        return imageCode;
    }
    
    /**
     * 设置 imageCode
     * 
     * @param 对imageCode进行赋值
     */
    public void setImageCode(String imageCode)
    {
        this.imageCode = imageCode;
    }
    
    /**
     * 获取 operatorCode
     * 
     * @return 返回 operatorCode
     */
    public String getOperatorCode()
    {
        return operatorCode;
    }
    
    /**
     * 设置 operatorCode
     * 
     * @param 对operatorCode进行赋值
     */
    public void setOperatorCode(String operatorCode)
    {
        this.operatorCode = operatorCode;
    }
    
}
