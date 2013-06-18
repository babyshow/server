/*
 * 文 件 名:  UploadUrlRequest.java
 * 描    述:  UploadUrlRequest.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.uploadurl;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadUrlRequest
{
    /**
     * 设备ID
     */
    private String device_id;
    
    /**
     * 照片描述
     */
    private String image_description;
    
    /**
     * 分享类型
     */
    private int share_type;
    
    /**
     * 第三方分享token
     */
    private String share_token;

    /**
     * 获取 device_id
     * @return 返回 device_id
     */
    public String getDevice_id()
    {
        return device_id;
    }

    /**
     * 设置 device_id
     * @param 对device_id进行赋值
     */
    public void setDevice_id(String device_id)
    {
        this.device_id = device_id;
    }

    /**
     * 获取 image_description
     * @return 返回 image_description
     */
    public String getImage_description()
    {
        return image_description;
    }

    /**
     * 设置 image_description
     * @param 对image_description进行赋值
     */
    public void setImage_description(String image_description)
    {
        this.image_description = image_description;
    }

    /**
     * 获取 share_type
     * @return 返回 share_type
     */
    public int getShare_type()
    {
        return share_type;
    }

    /**
     * 设置 share_type
     * @param 对share_type进行赋值
     */
    public void setShare_type(int share_type)
    {
        this.share_type = share_type;
    }

    /**
     * 获取 share_token
     * @return 返回 share_token
     */
    public String getShare_token()
    {
        return share_token;
    }

    /**
     * 设置 share_token
     * @param 对share_token进行赋值
     */
    public void setShare_token(String share_token)
    {
        this.share_token = share_token;
    }
    
    
}
