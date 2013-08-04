/*
 * 文 件 名:  ImageService.java
 * 描    述:  ImageService.java
 * 时    间:  2013-6-30
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
 * <一句话功能简述>
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
     * 根据照片ID查询照片
     * 
     * @param imageID
     * @param imageStyle
     * @return
     */
    public Image findImageByImageCode(String imageCode, int imageStyle)
    {
        Image image = this.imageDao.findImageByImageCode(imageCode);
        // 根据Image中的urlKey和imageStyle去七牛服务器提取图片URL
        String uploadToken = this.qiniuDownloadService.token(image.getUrlKey());
        String url = QiNiuUtil.generateDownloadUrl(image.getUrlKey(), uploadToken);
        image.setUrl(url);
        return image;
    }
    
    /**
     * 
     * 写入图片
     * 
     * @param image
     */
    public void insertImage(Image image)
    {
        this.imageDao.insertImage(image);
    }
    
    /**
     * 
     * 赞照片/取消赞照片
     * 
     * @param imageLike
     */
    public void InsertImageLike(ImageLike imageLike)
    {
        Date date = new Date();
        imageLike.setLikeTime(date);

        // TODO 这段代码写的不好需要整改
        
        if(ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE == imageLike.getLikeType())
        {
            // 判断该用户是否已经赞该照片
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
                    // 写入赞照片表
                    this.imageDao.insertImageLike(imageLike);
                }
                else
                {
                    // 更新
                    this.imageDao.updateImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE);
                }
                
                // 增加照片中照片被赞次数，默认加1
                this.imageDao.updateImageLikeCount(imageLike.getImageCode(), 1);
            }
        }
        else if(ImageStaticConstant.IMAGE_LIKE_TYPE_DISLIKE == imageLike.getLikeType())
        {
            ImageLike imageDisLikeTemp = this.imageDao.findImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_DISLIKE);
            
            // 判断该用户是否已经取消赞该照片
            if(imageDisLikeTemp!=null)
            {
                log.warn(imageLike.getUserCode() + " has already dislike image " + imageLike.getImageCode());
            }
            else
            {
                ImageLike imagelikeTemp = this.imageDao.findImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_LIKE);

                if(imagelikeTemp==null)
                {
                    // 写入赞照片表
                    this.imageDao.insertImageLike(imageLike);
                }
                else
                {
                    // 更新
                    this.imageDao.updateImageLikeByUserCodeAndImageCode(imageLike.getUserCode(), imageLike.getImageCode(), ImageStaticConstant.IMAGE_LIKE_TYPE_DISLIKE);
                }
                
                // 取消赞照片，默认减1
                this.imageDao.updateImageLikeCount(imageLike.getImageCode(), -1);
            }
        }
    }
    
    /**
     * 
     * 根据照片代码删除照片
     * 
     * @param imageCode
     */
    public void deleleImageByImageCode(String imageCode)
    {
        this.imageDao.deleleImageByImageCode(imageCode);
    }
    
    /**
     * 查询展示照片
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
     * 查询比sinceImageCode发布的晚的userCode的照片num张照片
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
     * 查询比maxImageCode发布的早的userCode的照片num张照片
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
     * 根据image查询条件、page信息分页查询照片列表
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
            // 修改七牛Url
            uploadToken = this.qiniuDownloadService.token(image.getUrlKey());
            url = QiNiuUtil.generateDownloadUrl(image.getUrlKey(), uploadToken);
            image.setUrl(url);
        }
        return imageList;
    }
    
    /**
     * 
     * 根据image查询条件查询记录总数
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
     * 增加image被喜欢次数
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
     * 检查imageCode对应的图片是否存在
     * 
     * 存在返回true
     * 不存在返回false
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
     * 随机查询count张照片
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
            // 修改七牛Url
            uploadToken = this.qiniuDownloadService.token(image.getUrlKey());
            url = QiNiuUtil.generateDownloadUrl(image.getUrlKey(), uploadToken);
            image.setUrl(url);
        }
        return imageList;
    }
    
    /**
     * 
     * 判断用户是否赞某照片
     * 已赞返回true
     * 未赞返回false
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
