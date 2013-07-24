/*
 * �� �� ��:  QiNiuUtil.java
 * ��    ��:  QiNiuUtil.java
 * ʱ    ��:  2013-7-7
 */
package com.babyshow.util;

import com.babyshow.image.ImageStaticConstant;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-7]
 */
public class QiNiuUtil
{
    
    /**
     * 
     * �����û�code��ͼƬcode���ļ���չ�������ϴ��ļ���
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
     * ����ͼƬcode���ļ���չ��������ʱ�ļ��洢��
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
     * ������ţͼƬ���ص�ַ
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
