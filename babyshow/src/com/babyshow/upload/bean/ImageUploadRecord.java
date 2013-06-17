/*
 * 文 件 名:  ImageUploadRecord.java
 * 描    述:  ImageUploadRecord.java
 * 时    间:  2013-6-17
 */
package com.babyshow.upload.bean;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class ImageUploadRecord
{
    /**
     * 上次ID
     */
    private String uploadID;
    
    /**
     * 用户ID
     */
    private String userID;
    
    /**
     * 上传时间
     */
    private String uploadTime;
    
    /**
     * 照片描述
     */
    private String description;
    
    /**
     * 分享类型
     */
    private String shareType;
    
    /**
     * 上传结果
     */
    private String result;
    
    /**
     * 获取 uploadID
     * 
     * @return 返回 uploadID
     */
    public String getUploadID()
    {
        return uploadID;
    }
    
    /**
     * 设置 uploadID
     * 
     * @param 对uploadID进行赋值
     */
    public void setUploadID(String uploadID)
    {
        this.uploadID = uploadID;
    }
    
    /**
     * 获取 userID
     * 
     * @return 返回 userID
     */
    public String getUserID()
    {
        return userID;
    }
    
    /**
     * 设置 userID
     * 
     * @param 对userID进行赋值
     */
    public void setUserID(String userID)
    {
        this.userID = userID;
    }
    
    /**
     * 获取 uploadTime
     * 
     * @return 返回 uploadTime
     */
    public String getUploadTime()
    {
        return uploadTime;
    }
    
    /**
     * 设置 uploadTime
     * 
     * @param 对uploadTime进行赋值
     */
    public void setUploadTime(String uploadTime)
    {
        this.uploadTime = uploadTime;
    }
    
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
     * 获取 shareType
     * 
     * @return 返回 shareType
     */
    public String getShareType()
    {
        return shareType;
    }
    
    /**
     * 设置 shareType
     * 
     * @param 对shareType进行赋值
     */
    public void setShareType(String shareType)
    {
        this.shareType = shareType;
    }
    
    /**
     * 获取 result
     * 
     * @return 返回 result
     */
    public String getResult()
    {
        return result;
    }
    
    /**
     * 设置 result
     * 
     * @param 对result进行赋值
     */
    public void setResult(String result)
    {
        this.result = result;
    }
    
}
