/*
 * 文 件 名:  UserImageDetailResponse.java
 * 描    述:  UserImageDetailResponse.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.userimagedetail;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UserImageDetailResponse extends RestResponse
{
    /**
     * 照片Url
     */
    @JsonProperty("image_url")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private String imageUrl;
    
    /**
     * 获取 imageUrl
     * 
     * @return 返回 imageUrl
     */
    public String getImageUrl()
    {
        return imageUrl;
    }
    
    /**
     * 设置 imageUrl
     * 
     * @param 对imageUrl进行赋值
     */
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }
    
}
