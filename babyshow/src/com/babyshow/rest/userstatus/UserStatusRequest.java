/*
 * 文 件 名:  UserStatusRequest.java
 * 描    述:  UserStatusRequest.java
 * 时    间:  2013-6-18
 */
package com.babyshow.rest.userstatus;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.babyshow.rest.RestRequest;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-18]
 */
public class UserStatusRequest extends RestRequest
{
    /**
     * 设备ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * 获取 device_id
     * 
     * @return 返回 device_id
     */
    public String getDevice_id()
    {
        return device_id;
    }
    
    /**
     * 设置 device_id
     * 
     * @param 对device_id进行赋值
     */
    public void setDevice_id(String device_id)
    {
        this.device_id = device_id;
    }
    
}
