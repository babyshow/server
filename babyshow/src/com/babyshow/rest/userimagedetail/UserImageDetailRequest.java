/*
 * �� �� ��:  UserImageDetailRequest.java
 * ��    ��:  UserImageDetailRequest.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.userimagedetail;

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
public class UserImageDetailRequest extends RestRequest
{
    /**
     * �豸ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * ��ƬID
     */
    @NotNull(message = "{image.imageid.null}")
    @Size(min = 1, max = 64, message = "{image.imageid.length}")
    private String image_id;
    
    /**
     * ��Ƭ����
     */
    @Range(min = 0, max = 2, message = "{image.imagestyle.error}")
    private Integer image_style;
    
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
     * ��ȡ image_id
     * 
     * @return ���� image_id
     */
    public String getImage_id()
    {
        return image_id;
    }
    
    /**
     * ���� image_id
     * 
     * @param ��image_id���и�ֵ
     */
    public void setImage_id(String image_id)
    {
        this.image_id = image_id;
    }
    
    /**
     * ��ȡ image_style
     * 
     * @return ���� image_style
     */
    public Integer getImage_style()
    {
        return image_style;
    }
    
    /**
     * ���� image_style
     * 
     * @param ��image_style���и�ֵ
     */
    public void setImage_style(Integer image_style)
    {
        this.image_style = image_style;
    }
    
}
