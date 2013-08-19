/*
 * �� �� ��:  UploadUrlRequest.java
 * ��    ��:  UploadUrlRequest.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.uploadurl;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.babyshow.rest.RestRequest;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadUrlRequest extends RestRequest
{
    /**
     * �豸ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * ��Ƭ����
     */
    @Size(min = 0, max = 256, message = "{image.description.length}")
    private String image_description;
    
    /**
     * ��������
     */
    @Min(value = 0, message = "{image.sharetype.error}")
    @Max(value = 4, message = "{image.sharetype.error}")
    private int share_type;
    
    /**
     * ����������token
     */
    @Size(min = 0, max = 256, message = "{share.token.length}")
    private String share_token;

    /**
     * ��ȡ device_id
     * @return ���� device_id
     */
    public String getDevice_id()
    {
        return device_id;
    }

    /**
     * ���� device_id
     * @param ��device_id���и�ֵ
     */
    public void setDevice_id(String device_id)
    {
        this.device_id = device_id;
    }

    /**
     * ��ȡ image_description
     * @return ���� image_description
     */
    public String getImage_description()
    {
        return image_description;
    }

    /**
     * ���� image_description
     * @param ��image_description���и�ֵ
     */
    public void setImage_description(String image_description)
    {
        this.image_description = image_description;
    }

    /**
     * ��ȡ share_type
     * @return ���� share_type
     */
    public int getShare_type()
    {
        return share_type;
    }

    /**
     * ���� share_type
     * @param ��share_type���и�ֵ
     */
    public void setShare_type(int share_type)
    {
        this.share_type = share_type;
    }

    /**
     * ��ȡ share_token
     * @return ���� share_token
     */
    public String getShare_token()
    {
        return share_token;
    }

    /**
     * ���� share_token
     * @param ��share_token���и�ֵ
     */
    public void setShare_token(String share_token)
    {
        this.share_token = share_token;
    }
    
    
}
