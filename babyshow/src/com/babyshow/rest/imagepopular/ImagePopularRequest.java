/*
 * �� �� ��:  ImagePopularRequest.java
 * ��    ��:  ImagePopularRequest.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.imagepopular;

import com.babyshow.rest.RestRequest;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImagePopularRequest extends RestRequest
{
    /**
     * �豸ID
     */
    private String device_id;
    
    /**
     * ��Ƭ��ʽ
     */
    private int image_style;
    
    /**
     * ��ȡ device_id
     * 
     * @return ���� device_id
     */
    public String getDevice_id()
    {
        return device_id;
    }
    
    /**
     * ���� device_id
     * 
     * @param ��device_id���и�ֵ
     */
    public void setDevice_id(String device_id)
    {
        this.device_id = device_id;
    }
    
    /**
     * ��ȡ image_style
     * 
     * @return ���� image_style
     */
    public int getImage_style()
    {
        return image_style;
    }
    
    /**
     * ���� image_style
     * 
     * @param ��image_style���и�ֵ
     */
    public void setImage_style(int image_style)
    {
        this.image_style = image_style;
    }
    
}
