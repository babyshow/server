/*
 * �� �� ��:  ImagePopular.java
 * ��    ��:  ImagePopular.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.image.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImagePopular
{
    /**
     * չʾID
     */
    private Integer id;
    
    /**
     * ��ƬID
     */
    private String imageCode;
    
    /**
     * չʾʱ��
     */
    private Date showTime;
    
    /**
     * ״̬
     */
    private String status;
    
    /**
     * ��ȡ showTime
     * 
     * @return ���� showTime
     */
    public Date getShowTime()
    {
        return showTime;
    }
    
    /**
     * ���� showTime
     * 
     * @param ��showTime���и�ֵ
     */
    public void setShowTime(Date showTime)
    {
        this.showTime = showTime;
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
    
}
