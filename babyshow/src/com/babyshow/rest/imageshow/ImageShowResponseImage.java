/*
 * �� �� ��:  ImageShowResponseImage.java
 * ��    ��:  ImageShowResponseImage.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.imageshow;

import com.babyshow.image.bean.Image;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImageShowResponseImage
{
    /**
     * ��ƬID
     */
    private Image image;
    
    /**
     * ��ƬUrl
     */
    private String imageUrl;
    
    /**
     * ��Ƭϲ������
     */
    private int imageLikeCount;
    
    /**
     * ���û��Ƿ�����������Ƭ
     */
    private boolean likeStatus;
    
    /**
     * ��ȡ image
     * 
     * @return ���� image
     */
    public Image getImage()
    {
        return image;
    }
    
    /**
     * ���� image
     * 
     * @param ��image���и�ֵ
     */
    public void setImage(Image image)
    {
        this.image = image;
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