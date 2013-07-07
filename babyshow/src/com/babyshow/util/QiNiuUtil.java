/*
 * 文 件 名:  QiNiuUtil.java
 * 描    述:  QiNiuUtil.java
 * 时    间:  2013-7-7
 */
package com.babyshow.util;

import com.babyshow.image.ImageStaticConstant;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-7]
 */
public class QiNiuUtil
{
    
    /**
     * 
     * 根据用户code、图片code、文件扩展名生成上传文件名
     * 
     * @param userCode
     * @param imageCode
     * @param extName
     * @return
     */
    public static String generateQiniuKey(String userCode, String imageCode, String extName)
    {
        return MD5.md5Str(userCode) + "/" + imageCode + "." + extName;
    }
    
    /**
     * 
     * 根据图片code，文件扩展名生成临时文件存储名
     * 
     * @param imageCode
     * @param extName
     * @return
     */
    public static String generateStoreFileName(String imageCode, String extName)
    {
        return imageCode + "." + extName;
    }
    
    /**
     * 
     * 生成七牛图片下载地址
     * 
     * @param urlKey
     * @param token
     * @return
     */
    public static String generateDownloadUrl(String urlKey, String uploadToken)
    {
        return "http://" + ImageStaticConstant.IMAGE_DOWNLOAD_URL_PREFIX + ".qiniudn.com/" + urlKey + "?token=" + uploadToken;
    }
}
