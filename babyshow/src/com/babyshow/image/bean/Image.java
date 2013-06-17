/*
 * �� �� ��:  Image.java
 * ��    ��:  Image.java
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
public class Image
{
    /**
     * ��ƬID
     */
    private String imageID;
    
    /**
     * �����û�ID
     */
    private String userID;
    
    /**
     * ��Ƭ����
     */
    private String description;
    
    /**
     * ����ʱ��
     */
    private Date createdTime;
    
    /**
     * ��Ƭ��Ӧ�ƴ洢Key
     */
    private String urlKey;
    
    /**
     * ��Ƭ״̬
     */
    private String status;
    
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
     * ��ȡ description
     * 
     * @return ���� description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * ���� description
     * 
     * @param ��description���и�ֵ
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * ��ȡ createdTime
     * 
     * @return ���� createdTime
     */
    public Date getCreatedTime()
    {
        return createdTime;
    }
    
    /**
     * ���� createdTime
     * 
     * @param ��createdTime���и�ֵ
     */
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }
    
    /**
     * ��ȡ urlKey
     * 
     * @return ���� urlKey
     */
    public String getUrlKey()
    {
        return urlKey;
    }
    
    /**
     * ���� urlKey
     * 
     * @param ��urlKey���и�ֵ
     */
    public void setUrlKey(String urlKey)
    {
        this.urlKey = urlKey;
    }
    
    /**
     * ��ȡ status
     * 
     * @return ���� status
     */
    public String getStatus()
    {
        return status;
    }
    
    /**
     * ���� status
     * 
     * @param ��status���и�ֵ
     */
    public void setStatus(String status)
    {
        this.status = status;
    }
    
}
