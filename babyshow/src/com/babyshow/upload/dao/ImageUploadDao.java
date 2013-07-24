/*
 * �� �� ��:  ImageUploadDao.java
 * ��    ��:  ImageUploadDao.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.upload.dao;

import com.babyshow.upload.bean.ImageUpload;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-1]
 */
public interface ImageUploadDao
{
    
    /**
     * 
     * д���û��ϴ���¼
     * 
     * @param imageUpload
     */
    public void insertImageUpload(ImageUpload imageUpload);
    
    /**
     * 
     * ������ţKey�����ϴ���Ƭ��¼
     * @param qiniuKey
     * @return
     */
    public ImageUpload findImageUploadByQiniuKey(String qiniuKey);
    
    /**
     * 
     * ������ţKey�����ϴ�״̬
     * @param qiniuKey
     * @return
     */
    public void updateImageUploadResultByQiniuKey(int result, String qiniuKey);
}
