/*
 * �� �� ��:  ImageShowResponse.java
 * ��    ��:  ImageShowResponse.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.imageshow;

import java.util.ArrayList;
import java.util.List;

import com.babyshow.rest.RestResponse;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class ImageShowResponse extends RestResponse
{
    /**
     * ��Ƭ�б�
     */
    private List<ImageShowResponseImage> imageShowResponseImageList = new ArrayList<ImageShowResponseImage>();
    
    /**
     * ��ȡ imageShowResponseImageList
     * 
     * @return ���� imageShowResponseImageList
     */
    public List<ImageShowResponseImage> getImageShowResponseImageList()
    {
        return imageShowResponseImageList;
    }
    
    /**
     * ���� imageShowResponseImageList
     * 
     * @param ��imageShowResponseImageList���и�ֵ
     */
    public void setImageShowResponseImageList(List<ImageShowResponseImage> imageShowResponseImageList)
    {
        this.imageShowResponseImageList = imageShowResponseImageList;
    }
    
}
