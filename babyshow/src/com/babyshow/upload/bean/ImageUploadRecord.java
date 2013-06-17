/*
 * �� �� ��:  ImageUploadRecord.java
 * ��    ��:  ImageUploadRecord.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.upload.bean;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageUploadRecord
{
    /**
     * �ϴ�ID
     */
    private String uploadID;
    
    /**
     * �û�ID
     */
    private String userID;
    
    /**
     * �ϴ�ʱ��
     */
    private String uploadTime;
    
    /**
     * ��Ƭ����
     */
    private String description;
    
    /**
     * ��������
     */
    private String shareType;
    
    /**
     * �ϴ����
     */
    private String result;
    
    /**
     * ��ȡ uploadID
     * 
     * @return ���� uploadID
     */
    public String getUploadID()
    {
        return uploadID;
    }
    
    /**
     * ���� uploadID
     * 
     * @param ��uploadID���и�ֵ
     */
    public void setUploadID(String uploadID)
    {
        this.uploadID = uploadID;
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
     * ��ȡ uploadTime
     * 
     * @return ���� uploadTime
     */
    public String getUploadTime()
    {
        return uploadTime;
    }
    
    /**
     * ���� uploadTime
     * 
     * @param ��uploadTime���и�ֵ
     */
    public void setUploadTime(String uploadTime)
    {
        this.uploadTime = uploadTime;
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
     * ��ȡ shareType
     * 
     * @return ���� shareType
     */
    public String getShareType()
    {
        return shareType;
    }
    
    /**
     * ���� shareType
     * 
     * @param ��shareType���и�ֵ
     */
    public void setShareType(String shareType)
    {
        this.shareType = shareType;
    }
    
    /**
     * ��ȡ result
     * 
     * @return ���� result
     */
    public String getResult()
    {
        return result;
    }
    
    /**
     * ���� result
     * 
     * @param ��result���и�ֵ
     */
    public void setResult(String result)
    {
        this.result = result;
    }
    
}
