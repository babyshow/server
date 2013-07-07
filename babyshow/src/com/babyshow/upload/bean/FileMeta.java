/*
 * 文 件 名:  FileMeta.java
 * 描    述:  FileMeta.java
 * 时    间:  2013-7-7
 */
package com.babyshow.upload.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-7]
 */
public class FileMeta
{
    /**
     * 图片ID
     */
    @JsonIgnore
    private String id;
    
    /**
     * 图片名称
     */
    private String name;
    
    /**
     * 大小
     */
    private String size;
    
    /**
     * 图片地址
     */
    private String url;
    
    /**
     * 缩略图地址
     */
    private String thumbnail_url;
    
    /**
     * 删除地址
     */
    private String delete_url;
    
    /**
     * 删除方式:"GET","DELETE"
     */
    private String delete_type;
    
    /**
     * 图片存储绝对路径
     */
    @JsonIgnore
    private String realPath;
    
    /**
     * 获取 name
     * 
     * @return 返回 name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 设置 name
     * 
     * @param 对name进行赋值
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * 获取 size
     * 
     * @return 返回 size
     */
    public String getSize()
    {
        return size;
    }
    
    /**
     * 设置 size
     * 
     * @param 对size进行赋值
     */
    public void setSize(String size)
    {
        this.size = size;
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
    
    /**
     * 获取 thumbnail_url
     * 
     * @return 返回 thumbnail_url
     */
    public String getThumbnail_url()
    {
        return thumbnail_url;
    }
    
    /**
     * 设置 thumbnail_url
     * 
     * @param 对thumbnail_url进行赋值
     */
    public void setThumbnail_url(String thumbnail_url)
    {
        this.thumbnail_url = thumbnail_url;
    }
    
    /**
     * 获取 delete_url
     * 
     * @return 返回 delete_url
     */
    public String getDelete_url()
    {
        return delete_url;
    }
    
    /**
     * 设置 delete_url
     * 
     * @param 对delete_url进行赋值
     */
    public void setDelete_url(String delete_url)
    {
        this.delete_url = delete_url;
    }
    
    /**
     * 获取 delete_type
     * 
     * @return 返回 delete_type
     */
    public String getDelete_type()
    {
        return delete_type;
    }
    
    /**
     * 设置 delete_type
     * 
     * @param 对delete_type进行赋值
     */
    public void setDelete_type(String delete_type)
    {
        this.delete_type = delete_type;
    }
    
    /**
     * 获取 realPath
     * 
     * @return 返回 realPath
     */
    public String getRealPath()
    {
        return realPath;
    }
    
    /**
     * 设置 realPath
     * 
     * @param 对realPath进行赋值
     */
    public void setRealPath(String realPath)
    {
        this.realPath = realPath;
    }
    
    /**
     * 获取 id
     * 
     * @return 返回 id
     */
    public String getId()
    {
        return id;
    }
    
    /**
     * 设置 id
     * 
     * @param 对id进行赋值
     */
    public void setId(String id)
    {
        this.id = id;
    }
    
}
