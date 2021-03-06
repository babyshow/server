/*
 * 文 件 名:  ImageShowRequest.java
 * 描    述:  ImageShowRequest.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.imageshow;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.babyshow.rest.RestRequest;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImageShowRequest extends RestRequest
{
    /**
     * 设备ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * 照片返回个数
     */
    @Range(min = 1, max = 100, message = "{image.count.length}")
    private Integer count;
    
    /**
     * 照片样式
     */
    private int image_style;
    
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
    
    /**
     * 获取 image_style
     * 
     * @return 返回 image_style
     */
    public int getImage_style()
    {
        return image_style;
    }
    
    /**
     * 设置 image_style
     * 
     * @param 对image_style进行赋值
     */
    public void setImage_style(int image_style)
    {
        this.image_style = image_style;
    }
    
    /**
     * 获取 count
     * 
     * @return 返回 count
     */
    public Integer getCount()
    {
        return count;
    }
    
    /**
     * 设置 count
     * 
     * @param 对count进行赋值
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }
    
}
