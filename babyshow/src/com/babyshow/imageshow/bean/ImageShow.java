/*
 * �� �� ��:  ImageShow.java
 * ��    ��:  ImageShow.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.imageshow.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageShow
{
    /**
     * չʾID
     */
    private String showID;
    
    /**
     * ��ƬID
     */
    private String imageID;
    
    /**
     * չʾʱ��
     */
    private Date showTime;
    
    /**
     * ״̬
     */
    private String status;
    
    /**
     * ��ȡ showID
     * 
     * @return ���� showID
     */
    public String getShowID()
    {
        return showID;
    }
    
    /**
     * ���� showID
     * 
     * @param ��showID���и�ֵ
     */
    public void setShowID(String showID)
    {
        this.showID = showID;
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
    
}
