/*
 * �� �� ��:  ImageShowRequest.java
 * ��    ��:  ImageShowRequest.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.imageshow;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.babyshow.rest.RestRequest;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImageShowRequest extends RestRequest
{
    /**
     * �豸ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * ��Ƭ���ظ���
     */
    @Range(min = 1, max = 100, message = "{image.count.length}")
    private Integer count;
    
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
    
    /**
     * ��ȡ count
     * 
     * @return ���� count
     */
    public Integer getCount()
    {
        return count;
    }
    
    /**
     * ���� count
     * 
     * @param ��count���и�ֵ
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }
    
}
