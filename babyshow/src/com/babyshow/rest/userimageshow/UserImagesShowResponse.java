/*
 * 文 件 名:  UserImagesShowResponse.java
 * 描    述:  UserImagesShowResponse.java
 * 时    间:  2013-6-20
 */
package com.babyshow.rest.userimageshow;

import java.util.ArrayList;
import java.util.List;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserImagesShowResponse extends RestResponse
{
    /**
     * 照片列表
     */
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private List<UserImagesShowResponseImage> userImageShowResponseImageList = new ArrayList<UserImagesShowResponseImage>();
    
    /**
     * 照片总个数
     */
    @JsonProperty("total_number")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Integer totalNumber;
    
    /**
     * 获取 userImageShowResponseImageList
     * 
     * @return 返回 userImageShowResponseImageList
     */
    public List<UserImagesShowResponseImage> getUserImageShowResponseImageList()
    {
        return userImageShowResponseImageList;
    }
    
    /**
     * 设置 userImageShowResponseImageList
     * 
     * @param 对userImageShowResponseImageList进行赋值
     */
    public void setUserImageShowResponseImageList(List<UserImagesShowResponseImage> userImageShowResponseImageList)
    {
        this.userImageShowResponseImageList = userImageShowResponseImageList;
    }
    
    /**
     * 获取 totalNumber
     * 
     * @return 返回 totalNumber
     */
    public Integer getTotalNumber()
    {
        return totalNumber;
    }
    
    /**
     * 设置 totalNumber
     * 
     * @param 对totalNumber进行赋值
     */
    public void setTotalNumber(Integer totalNumber)
    {
        this.totalNumber = totalNumber;
    }
    
}
