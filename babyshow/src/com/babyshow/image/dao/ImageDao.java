/*
 * �� �� ��:  ImageDao.java
 * ��    ��:  ImageDao.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.image.dao;

import java.util.List;

import com.babyshow.image.bean.Image;
import com.babyshow.image.bean.ImageLike;
import com.babyshow.image.bean.ImagePopular;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
public interface ImageDao
{
    /**
     * 
     * ������ƬID��ѯ��Ƭ
     * 
     * @param imageID
     * @return
     */
    public Image findImageByImageCode(String imageCode);
    
    /**
     * 
     * д��ͼƬ
     * 
     * @param image
     */
    public void insertImage(Image image);
    
    /**
     * 
     * д������Ƭ״̬
     * 
     * @param imageLike
     */
    public void insertImageLike(ImageLike imageLike);
    
    /**
     * 
     * ������Ƭ����ɾ����Ƭ
     * 
     * @param imageCode
     */
    public void deleleImageByImageCode(String imageCode);
    
    /**
     * ����չʾ״̬��ѯչʾ��Ƭ
     * 
     * @param status
     * @return
     */
    public ImagePopular findImagePopular(int status);
    
    /**
     * 
     * ��ѯ��sinceImageCode���������userCode����Ƭ���� ��ˢ��������ʹ�ã�
     * 
     * @param sinceImageCode
     * @return
     */
    public int findImageCountBySinceImageCode(String sinceImageCode, String userCode);
    
    /**
     * 
     * ��ѯ��sinceImageCode���������userCode����Ƭnum����Ƭ
     * 
     * @param sinceImageCode
     * @param userCode
     * @param limit �α꿪ʼ��
     * @param num ��ȡ����Ƭ��
     * @return
     */
    public List<Image> findImageListBySinceImageCode(String sinceImageCode, String userCode, int limit, int num);
    
    
    /**
     * 
     * ��ѯ��maxImageCode���������userCode����Ƭ���� 
     * 
     * @param sinceImageCode
     * @return
     */
    public int findImageCountByMaxImageCode(String maxImageCode, String userCode);
    
    
    /**
     * 
     * ��ѯ��maxImageCode�������userCode����Ƭnum����Ƭ
     * 
     * @param maxImageCode
     * @param userCode
     * @param limit �α꿪ʼ��
     * @param num ��ȡ����Ƭ��
     * @return
     */
    public List<Image> findImageListByMaxImageCode(String maxImageCode, String userCode, int limit, int num);
}
