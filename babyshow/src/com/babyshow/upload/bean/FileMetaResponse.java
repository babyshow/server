/*
 * 文 件 名:  FileMetaResponse.java
 * 描    述:  FileMetaResponse.java
 * 时    间:  2013-7-7
 */
package com.babyshow.upload.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-7]
 */
public class FileMetaResponse
{
    
    /**
     * 文件列表
     */
    private List<FileMeta> files = new ArrayList<FileMeta>();
    
    /**
     * 获取 files
     * 
     * @return 返回 files
     */
    public List<FileMeta> getFiles()
    {
        return files;
    }
    
    /**
     * 设置 files
     * 
     * @param 对files进行赋值
     */
    public void setFiles(List<FileMeta> files)
    {
        this.files = files;
    }
    
}
