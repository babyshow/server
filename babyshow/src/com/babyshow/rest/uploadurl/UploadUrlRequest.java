/*
 * �� �� ��:  UploadUrlRequest.java
 * ��    ��:  UploadUrlRequest.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.uploadurl;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadUrlRequest
{
    /**
     * �豸ID
     */
    private String device_id;
    
    /**
     * ��Ƭ����
     */
    private String image_description;
    
    /**
     * ��������
     */
    private int share_type;
    
    /**
     * ����������token
     */
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
