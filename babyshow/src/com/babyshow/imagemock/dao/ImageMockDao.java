/*
 * 文 件 名:  ImageMockDao.java
 * 描    述:  ImageMockDao.java
 * 时    间:  2013-7-11
 */
package com.babyshow.imagemock.dao;

import com.babyshow.imagemock.bean.ImageMockRecord;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-11]
 */
public interface ImageMockDao
{
    /**
     * 
     * 写入图片修改记录
     * 
     * @param imageMockRecord
     */
    public void insertImageMockRecordDao(ImageMockRecord imageMockRecord);
}
