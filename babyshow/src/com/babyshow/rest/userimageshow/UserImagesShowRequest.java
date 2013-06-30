/*
 * �� �� ��:  UserImagesShowRequest.java
 * ��    ��:  UserImagesShowRequest.java
 * ʱ    ��:  2013-6-20
 */
package com.babyshow.rest.userimageshow;

import com.babyshow.rest.RestRequest;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserImagesShowRequest extends RestRequest
{
    /**
     * �豸ID
     */
    private String device_id;
    
    /**
     * �ƶ���Ƭ���ظ���
     */
    private Integer count;
    
    /**
     * ��ѯ��������ָ�����򷵻�ʱ���since_image_id������Ƭ��Ϣ
     */
    private String since_image_id;
    
    /**
     * ��ѯ��������ָ�����򷵻�ʱ���max_image_id�����Ƭ��Ϣ
     */
    private String max_image_id;
    
    /**
     * ��Ƭ��ʽ
     */
    private String image_style;
    
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
     * ��ȡ since_image_id
     * 
     * @return ���� since_image_id
     */
    public String getSince_image_id()
    {
        return since_image_id;
    }
    
    /**
     * ���� since_image_id
     * 
     * @param ��since_image_id���и�ֵ
     */
    public void setSince_image_id(String since_image_id)
    {
        this.since_image_id = since_image_id;
    }
    
    /**
     * ��ȡ max_image_id
     * 
     * @return ���� max_image_id
     */
    public String getMax_image_id()
    {
        return max_image_id;
    }
    
    /**
     * ���� max_image_id
     * 
     * @param ��max_image_id���и�ֵ
     */
    public void setMax_image_id(String max_image_id)
    {
        this.max_image_id = max_image_id;
    }
    
    /**
     * ��ȡ image_style
     * 
     * @return ���� image_style
     */
    public String getImage_style()
    {
        return image_style;
    }
    
    /**
     * ���� image_style
     * 
     * @param ��image_style���и�ֵ
     */
    public void setImage_style(String image_style)
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