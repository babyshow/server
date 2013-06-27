/*
 * �� �� ��:  UserStatusRequest.java
 * ��    ��:  UserStatusRequest.java
 * ʱ    ��:  2013-6-18
 */
package com.babyshow.rest.userstatus;

import javax.validation.constraints.NotNull;

import com.babyshow.rest.RestRequest;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-18]
 */
public class UserStatusRequest extends RestRequest
{
    /**
     * �豸ID
     */
    @NotNull(message = "{user.deviceid.error}")
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
