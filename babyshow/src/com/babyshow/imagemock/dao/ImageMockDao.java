/*
 * �� �� ��:  ImageMockDao.java
 * ��    ��:  ImageMockDao.java
 * ʱ    ��:  2013-7-11
 */
package com.babyshow.imagemock.dao;

import com.babyshow.imagemock.bean.ImageMockRecord;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-11]
 */
public interface ImageMockDao
{
    /**
     * 
     * д��ͼƬ�޸ļ�¼
     * 
     * @param imageMockRecord
     */
    public void insertImageMockRecordDao(ImageMockRecord imageMockRecord);
}
