/*
 * �� �� ��:  UserImagesShowResponseImage.java
 * ��    ��:  UserImagesShowResponseImage.java
 * ʱ    ��:  2013-6-20
 */
package com.babyshow.rest.userimageshow;

import com.babyshow.image.bean.Image;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserImagesShowResponseImage
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
