/*
 * �� �� ��:  FileMetaResponse.java
 * ��    ��:  FileMetaResponse.java
 * ʱ    ��:  2013-7-7
 */
package com.babyshow.upload.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-7]
 */
public class FileMetaResponse
{
    
    /**
     * �ļ��б�
     */
    private List<FileMeta> files = new ArrayList<FileMeta>();
    
    /**
     * ��ȡ files
     * 
     * @return ���� files
     */
    public List<FileMeta> getFiles()
    {
        return files;
    }
    
    /**
     * ���� files
     * 
     * @param ��files���и�ֵ
     */
    public void setFiles(List<FileMeta> files)
    {
        this.files = files;
    }
    
}
