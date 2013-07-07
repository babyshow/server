/*
 * 文 件 名:  UploadStaticConstant.java
 * 描    述:  UploadStaticConstant.java
 * 时    间:  2013-7-1
 */
package com.babyshow.upload;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-1]
 */
public interface UploadStaticConstant
{
    public static final int IMAGE_UPLOAD_STATUS_INIT = 0;
    
    public static final String FILELIST_SESSION_STRING = "fileList";
    
    /**
     * 上传路径，位于"webapp/{工程}/upload"文件夹下
     */
    public static final String UPLOAD_PATH = "/upload";
    
    /**
     * 分割符
     */
    public static final String SEPARATOR = "/";
    
    /**
     * jquery删除已上传图片回调方法类型
     */
    public static final String DELETE_TYPE = "DELETE";
    
    /**
     * 删除地址
     */
    public static final String DELETE_URL = "../upload/";
    
    /**
     * 用户代码
     */
    public static final String PARAM_USERCODE = "usercode";
    
    /**
     * 年月日
     */
    public static final String PARAM_DATETIME = "datetime";
    
    /**
     * 小时、分钟
     */
    public static final String PARAM_HOURTIME = "hourtime";
    
    /**
     * 喜欢次数
     */
    public static final String PARAM_LIKETIMES = "liketimes";
    
    /**
     * 照片描述
     */
    public static final String PARAM_DESCRIPTION = "descritpion";
}
