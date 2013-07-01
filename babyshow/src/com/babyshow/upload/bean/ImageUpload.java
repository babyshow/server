/*
 * �� �� ��:  ImageUpload.java
 * ��    ��:  ImageUpload.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.upload.bean;

import java.util.Date;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageUpload
{
    /**
     * �ϴ�ID
     */
    private Integer id;
    
    /**
     * �û�Code
     */
    private String userCode;
    
    /**
     * �ϴ�ʱ��
     */
    private Date uploadTime;
    
    /**
     * ��Ƭ����
     */
    private String description;
    
    /**
     * ��������
     */
    private Integer shareType;
    
    /**
     * �ϴ����
     */
    private Integer result;
    
    /**
     * ������token
     */
    private String shareToken;
    
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
     * ��ȡ uploadTime
     * 
     * @return ���� uploadTime
     */
    public Date getUploadTime()
    {
        return uploadTime;
    }
    
    /**
     * ���� uploadTime
     * 
     * @param ��uploadTime���и�ֵ
     */
    public void setUploadTime(Date uploadTime)
    {
        this.uploadTime = uploadTime;
    }
    
    /**
     * ��ȡ shareType
     * 
     * @return ���� shareType
     */
    public Integer getShareType()
    {
        return shareType;
    }
    
    /**
     * ���� shareType
     * 
     * @param ��shareType���и�ֵ
     */
    public void setShareType(Integer shareType)
    {
        this.shareType = shareType;
    }
    
    /**
     * ��ȡ result
     * 
     * @return ���� result
     */
    public Integer getResult()
    {
        return result;
    }
    
    /**
     * ���� result
     * 
     * @param ��result���и�ֵ
     */
    public void setResult(Integer result)
    {
        this.result = result;
    }
    
    /**
     * ��ȡ shareToken
     * 
     * @return ���� shareToken
     */
    public String getShareToken()
    {
        return shareToken;
    }
    
    /**
     * ���� shareToken
     * 
     * @param ��shareToken���и�ֵ
     */
    public void setShareToken(String shareToken)
    {
        this.shareToken = shareToken;
    }
    
}
