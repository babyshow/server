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
