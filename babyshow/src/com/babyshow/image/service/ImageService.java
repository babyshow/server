/*
 * �� �� ��:  ImageService.java
 * ��    ��:  ImageService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.image.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.filter.OperatorSignInFiler;
import com.babyshow.image.ImageStaticConstant;
import com.babyshow.image.bean.Image;
import com.babyshow.image.bean.ImageLike;
import com.babyshow.image.bean.ImagePopular;
import com.babyshow.image.dao.ImageDao;
import com.babyshow.upload.qiniu.QiniuDownloadService;
import com.babyshow.util.Page;
import com.babyshow.util.QiNiuUtil;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class ImageService
{
    @Autowired
    private ImageDao imageDao;
    
    @Autowired
    private QiniuDownloadService qiniuDownloadService;
    
    private static Logger log = Logger.getLogger(OperatorSignInFiler.class);
    
    /**
     * ������ƬID��ѯ��Ƭ
     * 
     * @param imageID
     * @param imageStyle
     * @return
     */
    public Image findImageByImageCode(String imageCode, int imageStyle)
    {
        Image image = this.imageDao.findImageByImageCode(imageCode);
        // ����Image�е�urlKey��imageStyleȥ��ţ��������ȡͼƬURL
        String uploadToken = this.qiniuDownloadService.token(image.getUrlKey());
        String url = QiNiuUtil.generateDownloadUrl(image.getUrlKey(), uploadToken);
        image.setUrl(url);
        return image;
    }
    
    /**
     * 
     * д��ͼƬ
     * 
     * @param image
     */
    public void insertImage(Image image)
    {
        this.imageDao.insertImage(image);
    }
    
    /**
     * 
     * ����Ƭ/ȡ������Ƭ
     * 
     * @param imageLike
     */
    public void InsertImageLike(ImageLike imageLike)
    {
        Date date = new Date();
        imageLike.setLikeTime(date);

        // TODO ��δ���д�Ĳ�����Ҫ����
        
        if(ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE == imageLike.getLikeType())
        {
            // �жϸ��û��Ƿ��Ѿ��޸���Ƭ
            ImageLike imageLikeTemp = this.imageDao.findImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE);
            if(imageLikeTemp!=null)
            {
                log.warn(imageLike.getUserCode() + " has already like image " + imageLike.getImageCode());
            }
            else
            {
                ImageLike imageDisLikeTemp = this.imageDao.findImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_DISLIKE);

                if(imageDisLikeTemp == null)
                {
                    // д������Ƭ��
                    this.imageDao.insertImageLike(imageLike);
                }
                else
                {
                    // ����
                    this.imageDao.updateImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE);
                }
                
                // ������Ƭ����Ƭ���޴�����Ĭ�ϼ�1
                this.imageDao.updateImageLikeCount(imageLike.getImageCode(), 1);
            }
        }
        else if(ImageStaticConstant.IMAGE_LIKE_TYPE_DISLIKE == imageLike.getLikeType())
        {
            ImageLike imageDisLikeTemp = this.imageDao.findImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_DISLIKE);
            
            // �жϸ��û��Ƿ��Ѿ�ȡ���޸���Ƭ
            if(imageDisLikeTemp!=null)
            {
                log.warn(imageLike.getUserCode() + " has already dislike image " + imageLike.getImageCode());
            }
            else
            {
                ImageLike imagelikeTemp = this.imageDao.findImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE);

                if(imagelikeTemp==null)
                {
                    // д������Ƭ��
                    this.imageDao.insertImageLike(imageLike);
                }
                else
                {
                    // ����
                    this.imageDao.updateImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_DISLIKE);
                }
                
                // ȡ������Ƭ��Ĭ�ϼ�1
                this.imageDao.updateImageLikeCount(imageLike.getImageCode(), -1);
            }
        }
    }
    
    /**
     * 
     * ������Ƭ����ɾ����Ƭ
     * 
     * @param imageCode
     */
    public void deleleImageByImageCode(String imageCode)
    {
        this.imageDao.deleleImageByImageCode(imageCode);
    }
    
    /**
     * ��ѯչʾ��Ƭ
     * 
     * @param status
     * @return
     */
    public ImagePopular findImagePopular()
    {
        return this.imageDao.findImagePopular(ImageStaticConstant.IMAGE_POPULAR_STATUS_NORMAL);
    }
    
    /**
     * 
     * ��ѯ��sinceImageCode���������userCode����Ƭnum����Ƭ
     * 
     * @param sinceImageCode
     * @param userCode
     * @param limit
     * @return
     */
    public List<Image> findImageListBySinceImageCode(String sinceImageCode, String userCode, int num)
    {
        int limit = this.imageDao.findImageCountBySinceImageCode(sinceImageCode, userCode);
        return this.imageDao.findImageListBySinceImageCode(sinceImageCode, userCode, limit, num);
    }
    
    /**
     * 
     * ��ѯ��maxImageCode���������userCode����Ƭnum����Ƭ
     * 
     * @param sinceImageCode
     * @param userCode
     * @param limit
     * @return
     */
    public List<Image> findImageListByMaxImageCode(String sinceImageCode, String userCode, int num)
    {
        int limit = this.imageDao.findImageCountByMaxImageCode(sinceImageCode, userCode);
        return this.imageDao.findImageListByMaxImageCode(sinceImageCode, userCode, limit, num);
    }
    
    /**
     * 
     * ����image��ѯ������page��Ϣ��ҳ��ѯ��Ƭ�б�
     * 
     * @param userCondition
     * @param page
     * @return
     */
    public List<Image> findImageListByQueryConditionAndPage(@Param("imageCondition") Image imageCondition, @Param("page") Page page)
    {
        List<Image> imageList = this.imageDao.findImageListByQueryConditionAndPage(imageCondition, page);

        String url = null;
        String uploadToken = null;
        for (Image image : imageList)
        {
            // �޸���ţUrl
            uploadToken = this.qiniuDownloadService.token(image.getUrlKey());
            url = QiNiuUtil.generateDownloadUrl(image.getUrlKey(), uploadToken);
            image.setUrl(url);
        }
        return imageList;
    }
    
    /**
     * 
     * ����image��ѯ������ѯ��¼����
     * 
     * @param userCondition
     * @return
     */
    public int findImageListCountByQueryCondition(@Param("imageCondition") Image imageCondition)
    {
        return this.imageDao.findImageListCountByQueryCondition(imageCondition);
    }
    
    /**
     * 
     * ����image��ϲ������
     * 
     * @param userCondition
     * @return
     */
    public void updateImageLikeCount(String imageCode, int count)
    {
        this.imageDao.updateImageLikeCount(imageCode, count);
    }
    
    /**
     * 
     * ���imageCode��Ӧ��ͼƬ�Ƿ����
     * 
     * ���ڷ���true
     * �����ڷ���false
     * @param imageCode
     * @return
     */
    public boolean checkImageExistByImageCode(String imageCode)
    {
        Image image = this.imageDao.findImageByImageCode(imageCode);
        return image != null;
    }
    
    /**
     * 
     * �����ѯcount����Ƭ
     * 
     * @param imageStyle
     * @param count
     * @return
     */
    public List<Image> findRandomImageList(int imageStyle, int count)
    {
        List<Image> imageList = this.imageDao.findRandomImageList(count);

        String url = null;
        String uploadToken = null;
        for (Image image : imageList)
        {
            // �޸���ţUrl
            uploadToken = this.qiniuDownloadService.token(image.getUrlKey());
            url = QiNiuUtil.generateDownloadUrl(image.getUrlKey(), uploadToken);
            image.setUrl(url);
        }
        return imageList;
    }
    
    /**
     * 
     * �ж��û��Ƿ���ĳ��Ƭ
     * ���޷���true
     * δ�޷���false
     * 
     * @param userCode
     * @param imageCode
     * @return
     */
    public boolean isImageLikeExist(String userCode, String imageCode)
    {
        ImageLike imageLike = this.imageDao.findImageLikeByUserCodeAndImageCode(userCode, imageCode, ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE);
        return imageLike != null;
    }
}
