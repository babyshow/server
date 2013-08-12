/*
 * 文 件 名:  UserImagesShowRequest.java
 * 描    述:  UserImagesShowRequest.java
 * 时    间:  2013-6-20
 */
package com.babyshow.rest.userimageshow;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.babyshow.rest.RestRequest;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserImagesShowRequest extends RestRequest
{
    /**
     * 设备ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * 制定照片返回个数
     */
    @Range(min = 1, max = 100, message = "image.count.length")
    private Integer count;
    
    /**
     * 查询条件，若指定，则返回时间比since_image_id晚的照片信息
     */
    @NotNull(message = "{image.imageid.null}")
    @Size(min = 1, max = 64, message = "{image.imageid.length}")
    private String since_image_id;
    
    /**
     * 查询条件，若指定，则返回时间比max_image_id早的照片信息
     */
    @NotNull(message = "{image.imageid.null}")
    @Size(min = 1, max = 64, message = "{image.imageid.length}")
    private String max_image_id;
    
    /**
     * 照片样式
     */
    @Range(min = 0, max = 2, message = "{image.imagestyle.error}")
    private String image_style;
    
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
     * 获取 since_image_id
     * 
     * @return 返回 since_image_id
     */
    public String getSince_image_id()
    {
        return since_image_id;
    }
    
    /**
     * 设置 since_image_id
     * 
     * @param 对since_image_id进行赋值
     */
    public void setSince_image_id(String since_image_id)
    {
        this.since_image_id = since_image_id;
    }
    
    /**
     * 获取 max_image_id
     * 
     * @return 返回 max_image_id
     */
    public String getMax_image_id()
    {
        return max_image_id;
    }
    
    /**
     * 设置 max_image_id
     * 
     * @param 对max_image_id进行赋值
     */
    public void setMax_image_id(String max_image_id)
    {
        this.max_image_id = max_image_id;
    }
    
    /**
     * 获取 image_style
     * 
     * @return 返回 image_style
     */
    public String getImage_style()
    {
        return image_style;
    }
    
    /**
     * 设置 image_style
     * 
     * @param 对image_style进行赋值
     */
    public void setImage_style(String image_style)
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
