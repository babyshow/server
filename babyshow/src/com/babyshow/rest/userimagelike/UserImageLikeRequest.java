/*
 * 文 件 名:  UserImageLikeRequest.java
 * 描    述:  UserImageLikeRequest.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.userimagelike;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UserImageLikeRequest
{
    /**
     * 设备ID
     */
    private String device_id;
    
    /**
     * 照片ID
     */
    private String image_id;
    
    /**
     * 评论类型
     */
    private int like_type;
    
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
     * 
     * @return 返回 like_type
     */
    public int getLike_type()
    {
        return like_type;
    }
    
    /**
     * 设置 like_type
     * 
     * @param 对like_type进行赋值
     */
    public void setLike_type(int like_type)
    {
        this.like_type = like_type;
    }
    
}
