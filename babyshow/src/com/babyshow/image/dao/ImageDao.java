/*
 * �� �� ��:  ImageDao.java
 * ��    ��:  ImageDao.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.image.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.babyshow.image.bean.Image;
import com.babyshow.image.bean.ImageLike;
import com.babyshow.image.bean.ImagePopular;
import com.babyshow.util.Page;

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


    /**
     * 
     * ����image��ѯ������page��Ϣ��ҳ��ѯ��Ƭ�б�
     * 
     * @param userCondition
     * @param page
     * @return
     */
    public List<Image> findImageListByQueryConditionAndPage(@Param("imageCondition") Image imageCondition, @Param("page") Page page); 
    
    /**
     * 
     * ����image��ѯ������ѯ��¼����
     * 
     * @param userCondition
     * @return
     */
    public int findImageListCountByQueryCondition(@Param("imageCondition") Image imageCondition); 
    
    /**
     * 
     * ����image��ϲ������
     * 
     * @param userCondition
     * @return
     */
    public void updateImageLikeCount(@Param("imageCode") String imageCode, @Param("count") int count); 

    
    /**
     * 
     * �����ѯcount��ͼƬ
     * 
     * @param count
     * @return
     */
    public List<Image> findRandomImageList(int count);
    
    /**
     * 
     * ��ѯ�û��Ƿ����޻�δ��ĳ����Ƭ
     * 
     * @param userCode
     * @param imageCode
     * @return
     */
    public ImageLike findImageLikeByUserCodeAndImageCode(@Param("userCode") String userCode, @Param("imageCode") String imageCode, @Param("likeType") int likeType);

    /**
     * 
     * �޸��û�����Ƭ״̬
     * 
     * @param userCode
     * @param imageCode
     * @return
     */
    public void updateImageLikeByUserCodeAndImageCode(@Param("userCode") String userCode, @Param("imageCode") String imageCode, @Param("likeType") int likeType);

}
