/*
 * 文 件 名:  ImageUpload.java
 * 描    述:  ImageUpload.java
 * 时    间:  2013-6-17
 */
package com.babyshow.upload.bean;

import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageUpload
{
    /**
     * 上传ID
     */
    private Integer id;
    
    /**
     * 用户Code
     */
    private String userCode;
    
    /**
     * 上传时间
     */
    private Date uploadTime;
    
    /**
     * 照片描述
     */
    private String description;
    
    /**
     * 分享类型
     */
    private Integer shareType;
    
    /**
     * 上传结果
     */
    private Integer result;
    
    /**
     * 第三方token
     */
    private String shareToken;
    
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
     * 获取 uploadTime
     * 
     * @return 返回 uploadTime
     */
    public Date getUploadTime()
    {
        return uploadTime;
    }
    
    /**
     * 设置 uploadTime
     * 
     * @param 对uploadTime进行赋值
     */
    public void setUploadTime(Date uploadTime)
    {
        this.uploadTime = uploadTime;
    }
    
    /**
     * 获取 shareType
     * 
     * @return 返回 shareType
     */
    public Integer getShareType()
    {
        return shareType;
    }
    
    /**
     * 设置 shareType
     * 
     * @param 对shareType进行赋值
     */
    public void setShareType(Integer shareType)
    {
        this.shareType = shareType;
    }
    
    /**
     * 获取 result
     * 
     * @return 返回 result
     */
    public Integer getResult()
    {
        return result;
    }
    
    /**
     * 设置 result
     * 
     * @param 对result进行赋值
     */
    public void setResult(Integer result)
    {
        this.result = result;
    }
    
    /**
     * 获取 shareToken
     * 
     * @return 返回 shareToken
     */
    public String getShareToken()
    {
        return shareToken;
    }
    
    /**
     * 设置 shareToken
     * 
     * @param 对shareToken进行赋值
     */
    public void setShareToken(String shareToken)
    {
        this.shareToken = shareToken;
    }
    
}
