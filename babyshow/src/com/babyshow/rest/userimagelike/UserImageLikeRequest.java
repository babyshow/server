/*
 * 文 件 名:  UserImageLikeRequest.java
 * 描    述:  UserImageLikeRequest.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.userimagelike;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
public class UserImageLikeRequest extends RestRequest
{
    /**
     * 设备ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * 照片ID
     */
    @NotNull(message = "{image.imageid.null}")
    @Size(min = 1, max = 64, message = "{image.imageid.length}")
    private String image_id;
    
    /**
     * 评论类型
     */
    @NotNull(message = "{image.liketype.error}")
    @Range(min = 1, max = 100, message = "{image.liketype.error}")
    private Integer like_type;
    
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
     * 获取 image_id
     * 
     * @return 返回 image_id
     */
    public String getImage_id()
    {
        return image_id;
    }
    
    /**
     * 设置 image_id
     * 
     * @param 对image_id进行赋值
     */
    public void setImage_id(String image_id)
    {
        this.image_id = image_id;
    }

    /**
     * 获取 like_type
     * @return 返回 like_type
     */
    public Integer getLike_type()
    {
        return like_type;
    }

    /**
     * 设置 like_type
     * @param 对like_type进行赋值
     */
    public void setLike_type(Integer like_type)
    {
        this.like_type = like_type;
    }
    
}
