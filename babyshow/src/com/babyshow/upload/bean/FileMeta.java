/*
 * �� �� ��:  FileMeta.java
 * ��    ��:  FileMeta.java
 * ʱ    ��:  2013-7-7
 */
package com.babyshow.upload.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-7]
 */
public class FileMeta
{
    /**
     * ͼƬID
     */
    @JsonIgnore
    private String id;
    
    /**
     * ͼƬ����
     */
    private String name;
    
    /**
     * ��С
     */
    private String size;
    
    /**
     * ͼƬ��ַ
     */
    private String url;
    
    /**
     * ����ͼ��ַ
     */
    private String thumbnail_url;
    
    /**
     * ɾ����ַ
     */
    private String delete_url;
    
    /**
     * ɾ����ʽ:"GET","DELETE"
     */
    private String delete_type;
    
    /**
     * ͼƬ�洢����·��
     */
    @JsonIgnore
    private String realPath;
    
    /**
     * ��ȡ name
     * 
     * @return ���� name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * ���� name
     * 
     * @param ��name���и�ֵ
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * ��ȡ size
     * 
     * @return ���� size
     */
    public String getSize()
    {
        return size;
    }
    
    /**
     * ���� size
     * 
     * @param ��size���и�ֵ
     */
    public void setSize(String size)
    {
        this.size = size;
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
    
    /**
     * ��ȡ thumbnail_url
     * 
     * @return ���� thumbnail_url
     */
    public String getThumbnail_url()
    {
        return thumbnail_url;
    }
    
    /**
     * ���� thumbnail_url
     * 
     * @param ��thumbnail_url���и�ֵ
     */
    public void setThumbnail_url(String thumbnail_url)
    {
        this.thumbnail_url = thumbnail_url;
    }
    
    /**
     * ��ȡ delete_url
     * 
     * @return ���� delete_url
     */
    public String getDelete_url()
    {
        return delete_url;
    }
    
    /**
     * ���� delete_url
     * 
     * @param ��delete_url���и�ֵ
     */
    public void setDelete_url(String delete_url)
    {
        this.delete_url = delete_url;
    }
    
    /**
     * ��ȡ delete_type
     * 
     * @return ���� delete_type
     */
    public String getDelete_type()
    {
        return delete_type;
    }
    
    /**
     * ���� delete_type
     * 
     * @param ��delete_type���и�ֵ
     */
    public void setDelete_type(String delete_type)
    {
        this.delete_type = delete_type;
    }
    
    /**
     * ��ȡ realPath
     * 
     * @return ���� realPath
     */
    public String getRealPath()
    {
        return realPath;
    }
    
    /**
     * ���� realPath
     * 
     * @param ��realPath���и�ֵ
     */
    public void setRealPath(String realPath)
    {
        this.realPath = realPath;
    }
    
    /**
     * ��ȡ id
     * 
     * @return ���� id
     */
    public String getId()
    {
        return id;
    }
    
    /**
     * ���� id
     * 
     * @param ��id���и�ֵ
     */
    public void setId(String id)
    {
        this.id = id;
    }
    
}
