/*
 * �� �� ��:  UserImageLikeRequest.java
 * ��    ��:  UserImageLikeRequest.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.userimagelike;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UserImageLikeRequest
{
    /**
     * �豸ID
     */
    private String device_id;
    
    /**
     * ��ƬID
     */
    private String image_id;
    
    /**
     * ��������
     */
    private int like_type;
    
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
     * ��ȡ like_type
     * 
     * @return ���� like_type
     */
    public int getLike_type()
    {
        return like_type;
    }
    
    /**
     * ���� like_type
     * 
     * @param ��like_type���и�ֵ
     */
    public void setLike_type(int like_type)
    {
        this.like_type = like_type;
    }
    
}
