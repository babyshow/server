/*
 * 文 件 名:  UserBabyLikeRequest.java
 * 描    述:  UserBabyLikeRequest.java
 * 时    间:  2013-6-20
 */
package com.babyshow.rest.userbabylike;

import com.babyshow.rest.RestRequest;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserBabyLikeRequest extends RestRequest
{
    /**
     * 设备ID
     */
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
