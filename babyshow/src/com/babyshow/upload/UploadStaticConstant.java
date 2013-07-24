/*
 * �� �� ��:  UploadStaticConstant.java
 * ��    ��:  UploadStaticConstant.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.upload;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-1]
 */
public interface UploadStaticConstant
{
    public static final int IMAGE_UPLOAD_STATUS_INIT = 0;
    
    public static final String FILELIST_SESSION_STRING = "fileList";
    
    /**
     * �ϴ�·����λ��"webapp/{����}/upload"�ļ�����
     */
    public static final String UPLOAD_PATH = "/upload";
    
    /**
     * �ָ��
     */
    public static final String SEPARATOR = "/";
    
    /**
     * jqueryɾ�����ϴ�ͼƬ�ص���������
     */
    public static final String DELETE_TYPE = "DELETE";
    
    /**
     * ɾ����ַ
     */
    public static final String DELETE_URL = "../upload/";
    
    /**
     * �û�����
     */
    public static final String PARAM_USERCODE = "usercode";
    
    /**
     * ������
     */
    public static final String PARAM_DATETIME = "datetime";
    
    /**
     * Сʱ������
     */
    public static final String PARAM_HOURTIME = "hourtime";
    
    /**
     * ϲ������
     */
    public static final String PARAM_LIKETIMES = "liketimes";
    
    /**
     * ��Ƭ����
     */
    public static final String PARAM_DESCRIPTION = "descritpion";
}
