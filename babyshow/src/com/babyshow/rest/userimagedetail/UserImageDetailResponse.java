/*
 * �� �� ��:  UserImageDetailResponse.java
 * ��    ��:  UserImageDetailResponse.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.userimagedetail;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UserImageDetailResponse extends RestResponse
{
    /**
     * ��ƬUrl
     */
    @JsonProperty("image_url")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private String imageUrl;
    
    /**
     * ��ȡ imageUrl
     * 
     * @return ���� imageUrl
     */
    public String getImageUrl()
    {
        return imageUrl;
    }
    
    /**
     * ���� imageUrl
     * 
     * @param ��imageUrl���и�ֵ
     */
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }
    
}
