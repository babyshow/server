/*
 * 文 件 名:  ImageMockService.java
 * 描    述:  ImageMockService.java
 * 时    间:  2013-7-11
 */
package com.babyshow.imagemock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.imagemock.bean.ImageMockRecord;
import com.babyshow.imagemock.dao.ImageMockDao;

/**
 * <一句话功能简述>
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
     * 写入图片修改记录
     * 
     * @param imageMockRecord
     */
    public void insertImageMockRecordDao(ImageMockRecord imageMockRecord)
    {
        this.imageMockDao.insertImageMockRecordDao(imageMockRecord);
    }
}
