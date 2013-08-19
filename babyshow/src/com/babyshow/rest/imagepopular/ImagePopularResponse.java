/*
 * �� �� ��:  ImagePopularResponse.java
 * ��    ��:  ImagePopularResponse.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.imagepopular;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImagePopularResponse extends RestResponse
{
    /**
     * ��ƬID
     */
    @JsonProperty("image_id")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String imageID;
    
    /**
     * ��Ƭ·��
     */
    @JsonProperty("image_url")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String imageUrl;
    
    /**
     * ��Ƭ����
     */
    @JsonProperty("image_description")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String imageDescription;
    
    /**
     * ��Ƭ����ʱ��
     */
    @JsonProperty("image_created_time")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String imageCreatedTime;
    
    /**
     * ��Ƭ��ϲ������
     */
    @JsonProperty("image_like_count")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Integer imageLikeCount;
    
    /**
     * ���û�����Ƭ��ϲ��״̬
     */
    @JsonProperty("like_status")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Boolean likeStatus;
    
    /**
     * ��ȡ imageID
     * 
     * @return ���� imageID
     */
    public String getImageID()
    {
        return imageID;
    }
    
    /**
     * ���� imageID
     * 
     * @param ��imageID���и�ֵ
     */
    public void setImageID(String imageID)
    {
        this.imageID = imageID;
    }
    
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
    
    /**
     * ��ȡ imageDescription
     * 
     * @return ���� imageDescription
     */
    public String getImageDescription()
    {
        return imageDescription;
    }
    
    /**
     * ���� imageDescription
     * 
     * @param ��imageDescription���и�ֵ
     */
    public void setImageDescription(String imageDescription)
    {
        this.imageDescription = imageDescription;
    }
    
    /**
     * ��ȡ imageCreatedTime
     * 
     * @return ���� imageCreatedTime
     */
    public String getImageCreatedTime()
    {
        return imageCreatedTime;
    }
    
    /**
     * ���� imageCreatedTime
     * 
     * @param ��imageCreatedTime���и�ֵ
     */
    public void setImageCreatedTime(String imageCreatedTime)
    {
        this.imageCreatedTime = imageCreatedTime;
    }
    
    /**
     * ��ȡ imageLikeCount
     * 
     * @return ���� imageLikeCount
     */
    public Integer getImageLikeCount()
    {
        return imageLikeCount;
    }
    
    /**
     * ���� imageLikeCount
     * 
     * @param ��imageLikeCount���и�ֵ
     */
    public void setImageLikeCount(Integer imageLikeCount)
    {
        this.imageLikeCount = imageLikeCount;
    }
    
    /**
     * ��ȡ likeStatus
     * 
     * @return ���� likeStatus
     */
    public Boolean getLikeStatus()
    {
        return likeStatus;
    }
    
    /**
     * ���� likeStatus
     * 
     * @param ��likeStatus���и�ֵ
     */
    public void setLikeStatus(Boolean likeStatus)
    {
        this.likeStatus = likeStatus;
    }
    
}
