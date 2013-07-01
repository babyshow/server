/*
 * �� �� ��:  ImagePopularResponse.java
 * ��    ��:  ImagePopularResponse.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.imagepopular;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private String imageID;
    
    /**
     * ��Ƭ·��
     */
    @JsonProperty("image_url")
    private String imageUrl;
    
    /**
     * ��Ƭ����
     */
    @JsonProperty("image_description")
    private String imageDescription;
    
    /**
     * ��Ƭ����ʱ��
     */
    @JsonProperty("image_created_time")
    private String imageCreatedTime;
    
    /**
     * ��Ƭ��ϲ������
     */
    @JsonProperty("image_like_count")
    private int imageLikeCount;
    
    /**
     * ���û�����Ƭ��ϲ��״̬
     */
    @JsonProperty("like_status")
    private boolean likeStatus;
    
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
    public int getImageLikeCount()
    {
        return imageLikeCount;
    }
    
    /**
     * ���� imageLikeCount
     * 
     * @param ��imageLikeCount���и�ֵ
     */
    public void setImageLikeCount(int imageLikeCount)
    {
        this.imageLikeCount = imageLikeCount;
    }
    
    /**
     * ��ȡ likeStatus
     * 
     * @return ���� likeStatus
     */
    public boolean isLikeStatus()
    {
        return likeStatus;
    }
    
    /**
     * ���� likeStatus
     * 
     * @param ��likeStatus���и�ֵ
     */
    public void setLikeStatus(boolean likeStatus)
    {
        this.likeStatus = likeStatus;
    }
    
}
