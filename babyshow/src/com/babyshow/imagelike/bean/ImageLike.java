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
    private Integer id;
    
    /**
     * ��ƬID
     */
    private String imageCode;
    
    /**
     * �û�ID
     */
    private String userCode;
    
    /**
     * ��������
     */
    private String likeType;
    
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
    
    /**
     * ��ȡ id
     * 
     * @return ���� id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * ���� id
     * 
     * @param ��id���и�ֵ
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    /**
     * ��ȡ imageCode
     * 
     * @return ���� imageCode
     */
    public String getImageCode()
    {
        return imageCode;
    }
    
    /**
     * ���� imageCode
     * 
     * @param ��imageCode���и�ֵ
     */
    public void setImageCode(String imageCode)
    {
        this.imageCode = imageCode;
    }
    
    /**
     * ��ȡ userCode
     * 
     * @return ���� userCode
     */
    public String getUserCode()
    {
        return userCode;
    }
    
    /**
     * ���� userCode
     * 
     * @param ��userCode���и�ֵ
     */
    public void setUserCode(String userCode)
    {
        this.userCode = userCode;
    }
    
}
