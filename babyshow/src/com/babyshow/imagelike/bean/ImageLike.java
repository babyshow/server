/*
 * �� �� ��:  ImageLike.java
 * ��    ��:  ImageLike.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.imagelike.bean;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageLike
{
    /**
     * ��Ƭϲ��ID
     */
    private String likeID;
    
    /**
     * ��ƬID
     */
    private String imageID;
    
    /**
     * �û�ID
     */
    private String userID;
    
    /**
     * ��������
     */
    private String likeType;
    
    /**
     * ��ȡ likeID
     * 
     * @return ���� likeID
     */
    public String getLikeID()
    {
        return likeID;
    }
    
    /**
     * ���� likeID
     * 
     * @param ��likeID���и�ֵ
     */
    public void setLikeID(String likeID)
    {
        this.likeID = likeID;
    }
    
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
     * ��ȡ userID
     * 
     * @return ���� userID
     */
    public String getUserID()
    {
        return userID;
    }
    
    /**
     * ���� userID
     * 
     * @param ��userID���и�ֵ
     */
    public void setUserID(String userID)
    {
        this.userID = userID;
    }
    
    /**
     * ��ȡ likeType
     * 
     * @return ���� likeType
     */
    public String getLikeType()
    {
        return likeType;
    }
    
    /**
     * ���� likeType
     * 
     * @param ��likeType���и�ֵ
     */
    public void setLikeType(String likeType)
    {
        this.likeType = likeType;
    }
    
}
