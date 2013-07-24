/*
 * �� �� ��:  Image.java
 * ��    ��:  Image.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.image.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private Integer id;
    
    /**
     * ��Ƭcode
     */
    @JsonProperty("image_id")
    private String imageCode;
    
    /**
     * �����û�code
     */
    @JsonIgnore
    private String userCode;
    
    /**
     * ��Ƭ����
     */
    @JsonProperty("image_description")
    private String description;
    
    /**
     * ����ʱ��
     */
    @JsonProperty("image_created_time")
    private Date createdTime;
    
    /**
     * ��Ƭ��Ӧ�ƴ洢Key
     */
    @JsonIgnore
    private String urlKey;
    
    /**
     * ��Ƭ״̬
     */
    @JsonIgnore
    private Integer status;
    
    /**
     * ��Ƭ���ʵ�ַ
     */
    @JsonIgnore
    private String url;
    
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
     * ��ȡ status
     * 
     * @return ���� status
     */
    public Integer getStatus()
    {
        return status;
    }
    
    /**
     * ���� status
     * 
     * @param ��status���и�ֵ
     */
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    /**
     * ��ȡ url
     * 
     * @return ���� url
     */
    public String getUrl()
    {
        return url;
    }
    
    /**
     * ���� url
     * 
     * @param ��url���и�ֵ
     */
    public void setUrl(String url)
    {
        this.url = url;
    }
    
}
