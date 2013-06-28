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
    private Integer id;
    
    /**
     * �û�ID
     */
    private String userCode;
    
    /**
     * ��ƬID
     */
    private String imageCode;
    
    /**
     * ����ʱ��
     */
    private Date viewTime;
    
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
}
