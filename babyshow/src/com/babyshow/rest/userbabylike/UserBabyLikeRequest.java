/*
 * �� �� ��:  UserBabyLikeRequest.java
 * ��    ��:  UserBabyLikeRequest.java
 * ʱ    ��:  2013-6-20
 */
package com.babyshow.rest.userbabylike;

import com.babyshow.rest.RestRequest;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserBabyLikeRequest extends RestRequest
{
    /**
     * �豸ID
     */
    private String device_id;
    
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
    
}
