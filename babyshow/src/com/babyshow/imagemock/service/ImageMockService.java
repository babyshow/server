/*
 * �� �� ��:  ImageMockService.java
 * ��    ��:  ImageMockService.java
 * ʱ    ��:  2013-7-11
 */
package com.babyshow.imagemock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.imagemock.bean.ImageMockRecord;
import com.babyshow.imagemock.dao.ImageMockDao;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-11]
 */
@Service
public class ImageMockService
{
    @Autowired
    private ImageMockDao imageMockDao;
    
    /**
     * 
     * д��ͼƬ�޸ļ�¼
     * 
     * @param imageMockRecord
     */
    public void insertImageMockRecordDao(ImageMockRecord imageMockRecord)
    {
        this.imageMockDao.insertImageMockRecordDao(imageMockRecord);
    }
}
