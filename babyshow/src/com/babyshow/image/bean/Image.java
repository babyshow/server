/*
 * 文 件 名:  Image.java
 * 描    述:  Image.java
 * 时    间:  2013-6-17
 */
package com.babyshow.image.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class Image
{
    /**
     * 照片ID
     */
    private Integer id;
    
    /**
     * 照片code
     */
    @JsonProperty("image_id")
    private String imageCode;
    
    /**
     * 所属用户code
     */
    @JsonIgnore
    private String userCode;
    
    /**
     * 照片描述
     */
    @JsonProperty("image_description")
    private String description;
    
    /**
     * 创建时间
     */
    @JsonProperty("image_created_time")
    private Date createdTime;
    
    /**
     * 照片对应云存储Key
     */
    @JsonIgnore
    private String urlKey;
    
    /**
     * 照片状态
     */
    @JsonIgnore
    private Integer status;
    
    /**
     * 照片访问地址
     */
    @JsonIgnore
    private String url;
    
    /**
     * 获取 description
     * 
     * @return 返回 description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * 设置 description
     * 
     * @param 对description进行赋值
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * 获取 createdTime
     * 
     * @return 返回 createdTime
     */
    public Date getCreatedTime()
    {
        return createdTime;
    }
    
    /**
     * 设置 createdTime
     * 
     * @param 对createdTime进行赋值
     */
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }
    
    /**
     * 获取 urlKey
     * 
     * @return 返回 urlKey
     */
    public String getUrlKey()
    {
        return urlKey;
    }
    
    /**
     * 设置 urlKey
     * 
     * @param 对urlKey进行赋值
     */
    public void setUrlKey(String urlKey)
    {
        this.urlKey = urlKey;
    }
    
    /**
     * 获取 id
     * 
     * @return 返回 id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * 设置 id
     * 
     * @param 对id进行赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    /**
     * 获取 imageCode
     * 
     * @return 返回 imageCode
     */
    public String getImageCode()
    {
        return imageCode;
    }
    
    /**
     * 设置 imageCode
     * 
     * @param 对imageCode进行赋值
     */
    public void setImageCode(String imageCode)
    {
        this.imageCode = imageCode;
    }
    
    /**
     * 获取 userCode
     * 
     * @return 返回 userCode
     */
    public String getUserCode()
    {
        return userCode;
    }
    
    /**
     * 设置 userCode
     * 
     * @param 对userCode进行赋值
     */
    public void setUserCode(String userCode)
    {
        this.userCode = userCode;
    }
    
    /**
     * 获取 status
     * 
     * @return 返回 status
     */
    public Integer getStatus()
    {
        return status;
    }
    
    /**
     * 设置 status
     * 
     * @param 对status进行赋值
     */
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    /**
     * 获取 url
     * 
     * @return 返回 url
     */
    public String getUrl()
    {
        return url;
    }
    
    /**
     * 设置 url
     * 
     * @param 对url进行赋值
     */
    public void setUrl(String url)
    {
        this.url = url;
    }
    
}
