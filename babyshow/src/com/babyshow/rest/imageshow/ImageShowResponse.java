/*
 * 文 件 名:  ImageShowResponse.java
 * 描    述:  ImageShowResponse.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.imageshow;

import java.util.ArrayList;
import java.util.List;

import com.babyshow.rest.RestResponse;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImageShowResponse extends RestResponse
{
    /**
     * 照片列表
     */
    private List<ImageShowResponseImage> imageShowResponseImageList = new ArrayList<ImageShowResponseImage>();
    
    /**
     * 获取 imageShowResponseImageList
     * 
     * @return 返回 imageShowResponseImageList
     */
    public List<ImageShowResponseImage> getImageShowResponseImageList()
    {
        return imageShowResponseImageList;
    }
    
    /**
     * 设置 imageShowResponseImageList
     * 
     * @param 对imageShowResponseImageList进行赋值
     */
    public void setImageShowResponseImageList(List<ImageShowResponseImage> imageShowResponseImageList)
    {
        this.imageShowResponseImageList = imageShowResponseImageList;
    }
    
}
