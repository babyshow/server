/*
 * 文 件 名:  BabyshowRest.java
 * 描    述:  BabyshowRest.java
 * 时    间:  2013-6-17
 */
package com.babyshow.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.babyshow.rest.imagepopular.ImagePopularRequest;
import com.babyshow.rest.imagepopular.ImagePopularResponse;
import com.babyshow.rest.imageshow.ImageShowRequest;
import com.babyshow.rest.imageshow.ImageShowResponse;
import com.babyshow.rest.uploadurl.UploadUrlRequest;
import com.babyshow.rest.uploadurl.UploadUrlResponse;
import com.babyshow.rest.userbabylike.UserBabyLikeRequest;
import com.babyshow.rest.userbabylike.UserBabyLikeResponse;
import com.babyshow.rest.userimagedestory.UserImageDestoryRequest;
import com.babyshow.rest.userimagedestory.UserImageDestoryResponse;
import com.babyshow.rest.userimagedetail.UserImageDetailRequest;
import com.babyshow.rest.userimagedetail.UserImageDetailResponse;
import com.babyshow.rest.userimagelike.UserImageLikeRequest;
import com.babyshow.rest.userimagelike.UserImageLikeResponse;
import com.babyshow.rest.userimageshow.UserImagesShowRequest;
import com.babyshow.rest.userimageshow.UserImagesShowResponse;
import com.babyshow.rest.userstatus.UserStatusRequest;
import com.babyshow.rest.userstatus.UserStatusResponse;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Controller
public class BabyshowRest
{
    @Autowired
    private RestHelper restHelper;
    
    /**
     * 
     * 用户状态请求
     * 
     * @param userStatusRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/users/status")
    @ResponseBody
    public UserStatusResponse getUserStatus(@RequestHeader
    HttpHeaders httpheaders, @Valid
    @ModelAttribute
    UserStatusRequest userStatusRequest, BindingResult bindingResult)
    {
        return (UserStatusResponse)restHelper.handleRest(httpheaders, userStatusRequest, bindingResult);
    }
    
    /**
     * 
     * 查询Baby被喜欢次数
     * 
     * @param httpheaders
     * @param userBabyLikeRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/users/baby_like_count")
    @ResponseBody
    public UserBabyLikeResponse getUserBabyLike(@RequestHeader
    HttpHeaders httpheaders, @Valid
    @ModelAttribute
    UserBabyLikeRequest userBabyLikeRequest, BindingResult bindingResult)
    {
        return (UserBabyLikeResponse)restHelper.handleRest(httpheaders, userBabyLikeRequest, bindingResult);
    }
    
    /**
     * 
     * 用户个人照片查看
     * 
     * @param httpheaders
     * @param userImagesShowRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/users/images/show")
    @ResponseBody
    public UserImagesShowResponse getUserImagesShow(@RequestHeader
        HttpHeaders httpheaders, @Valid
        @ModelAttribute
        UserImagesShowRequest userImagesShowRequest, BindingResult bindingResult)
    {
        return (UserImagesShowResponse)restHelper.handleRest(httpheaders, userImagesShowRequest, bindingResult);
    }
    
    
    /**
     * 
     * 照片详情查看
     * 
     * @param httpheaders
     * @param userImageDetailRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/users/images/detail")
    @ResponseBody
    public UserImageDetailResponse getUserImageDetail(@RequestHeader
        HttpHeaders httpheaders, @Valid
        @ModelAttribute
        UserImageDetailRequest userImageDetailRequest, BindingResult bindingResult)
    {
        return (UserImageDetailResponse)restHelper.handleRest(httpheaders, userImageDetailRequest, bindingResult);
    }
    
    /**
     * 
     * 赞照片/取消赞照片
     * 
     * @param httpheaders
     * @param userImageLikeRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/users/images/like")
    @ResponseBody
    public UserImageLikeResponse doUserImageLike(@RequestHeader
        HttpHeaders httpheaders, @Valid
        @ModelAttribute
        UserImageLikeRequest userImageLikeRequest, BindingResult bindingResult)
    {
        return (UserImageLikeResponse)restHelper.handleRest(httpheaders, userImageLikeRequest, bindingResult);
    }
    
    
    /**
     * 
     * 删除照片
     * 
     * @param httpheaders
     * @param userImageDestoryRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/users/images/destroy")
    @ResponseBody
    public UserImageDestoryResponse delUserImageDestory(@RequestHeader
        HttpHeaders httpheaders, @Valid
        @ModelAttribute
        UserImageDestoryRequest userImageDestoryRequest, BindingResult bindingResult)
    {
        return (UserImageDestoryResponse)restHelper.handleRest(httpheaders, userImageDestoryRequest, bindingResult);
    }
    
    
    /**
     * 
     * 获取上传路径
     * 
     * @param httpheaders
     * @param uploadUrlRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/upload/url")
    @ResponseBody
    public UploadUrlResponse getUploadUrl(@RequestHeader
        HttpHeaders httpheaders, @Valid
        @ModelAttribute
        UploadUrlRequest uploadUrlRequest, BindingResult bindingResult)
    {
        return (UploadUrlResponse)restHelper.handleRest(httpheaders, uploadUrlRequest, bindingResult);
    }
    
    
    /**
     *  查询公共展示照片
     * 
     * @param httpheaders
     * @param imagePopularRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "public/images/popular")
    @ResponseBody
    public ImagePopularResponse getImagePopular(@RequestHeader
        HttpHeaders httpheaders, @Valid
        @ModelAttribute
        ImagePopularRequest imagePopularRequest, BindingResult bindingResult)
    {
        return (ImagePopularResponse)restHelper.handleRest(httpheaders, imagePopularRequest, bindingResult);
    }
    
    /**
     *  随机查看照片（find照片）
     * 
     * @param httpheaders
     * @param imagePopularRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "public/images/show")
    @ResponseBody
    public ImageShowResponse getImageShow(@RequestHeader
        HttpHeaders httpheaders, @Valid
        @ModelAttribute
        ImageShowRequest imageshowRequest, BindingResult bindingResult)
    {
        return (ImageShowResponse)restHelper.handleRest(httpheaders, imageshowRequest, bindingResult);
    }
}

