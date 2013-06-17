/*
 * �� �� ��:  UserViewRecord.java
 * ��    ��:  UserViewRecord.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.userview.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class UserViewRecord
{
    /**
     * ���ʼ�¼ID
     */
    private String recordID;
    
    /**
     * �û�ID
     */
    private String userID;
    
    /**
     * ��ƬID
     */
    private String imageID;
    
    /**
     * ����ʱ��
     */
    private Date viewTime;
    
    /**
     * ��ȡ recordID
     * 
     * @return ���� recordID
     */
    public String getRecordID()
    {
        return recordID;
    }
    
    /**
     * ���� recordID
     * 
     * @param ��recordID���и�ֵ
     */
    public void setRecordID(String recordID)
    {
        this.recordID = recordID;
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
     * ��ȡ viewTime
     * 
     * @return ���� viewTime
     */
    public Date getViewTime()
    {
        return viewTime;
    }
    
    /**
     * ���� viewTime
     * 
     * @param ��viewTime���и�ֵ
     */
    public void setViewTime(Date viewTime)
    {
        this.viewTime = viewTime;
    }
}
