/*
 * 文 件 名:  ImageUploadDao.java
 * 描    述:  ImageUploadDao.java
 * 时    间:  2013-7-1
 */
package com.babyshow.upload.dao;

import com.babyshow.upload.bean.ImageUpload;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-1]
 */
public interface ImageUploadDao
{
    
    /**
     * 
     * 写入用户上传记录
     * 
     * @param imageUpload
     */
    public void insertImageUpload(ImageUpload imageUpload);
    
    /**
     * 
     * 根据七牛Key查找上传照片记录
     * @param qiniuKey
     * @return
     */
    public ImageUpload findImageUploadByQiniuKey(String qiniuKey);
    
    /**
     * 
     * 根据七牛Key更新上传状态
     * @param qiniuKey
     * @return
     */
    public void updateImageUploadResultByQiniuKey(int result, String qiniuKey);
}
