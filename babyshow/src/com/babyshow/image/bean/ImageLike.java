/*
 * �� �� ��:  ImageLike.java
 * ��    ��:  ImageLike.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.image.bean;

import java.util.Date;

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
    private Integer likeType;
    
    /**
     * ����ʱ��
     */
    private Date likeTime;
    
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
    
    /**
     * ��ȡ likeType
     * 
     * @return ���� likeType
     */
    public Integer getLikeType()
    {
        return likeType;
    }
    
    /**
     * ���� likeType
     * 
     * @param ��likeType���и�ֵ
     */
    public void setLikeType(Integer likeType)
    {
        this.likeType = likeType;
    }
    
    /**
     * ��ȡ likeTime
     * 
     * @return ���� likeTime
     */
    public Date getLikeTime()
    {
        return likeTime;
    }
    
    /**
     * ���� likeTime
     * 
     * @param ��likeTime���и�ֵ
     */
    public void setLikeTime(Date likeTime)
    {
        this.likeTime = likeTime;
    }
    
}
