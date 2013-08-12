/*
 * 文 件 名:  RestService.java
 * 描    述:  RestService.java
 * 时    间:  2013-8-14
 */
package com.babyshow.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.babyshow.image.service.ImageService;
import com.babyshow.user.service.UserService;
import com.babyshow.util.PropertiesUtil;

/**
 * 继承该类可复用校验方法
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-8-14]
 */
public abstract class RestService
{
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private ImageService imageService;
    
    /**
     * 
     * 校验用户，存在返回true，不存在返回false
     * <br>
     * 校验失败时restResponse会写入错误码和错误信息
     * 
     * @param deviceID
     * @param restResponse
     * @return
     */
    protected boolean validateUser(String deviceID, RestResponse restResponse)
    {
        boolean isUserExist = this.userService.isUserExistByDeviceID(deviceID);
        if(!isUserExist)
        {
            String errors = PropertiesUtil.loadI18NProperty("user.deviceid.notexist");
            RestHelper.generateErrorMsg(restResponse, errors);
        }
        return isUserExist;
    }
    
    
    /**
     * 
     * 校验图片，存在返回true，不存在返回false
     * <br>
     * 校验失败时restResponse会写入错误码和错误信息
     * 
     * @param imageCode
     * @param restResponse
     * @return
     */
    protected boolean validateImage(String imageCode, RestResponse restResponse)
    {
        boolean isImageExist = this.imageService.checkImageExistByImageCode(imageCode);
        if(!isImageExist)
        {
            String errors = PropertiesUtil.loadI18NProperty("image.imageid.notexist");
            RestHelper.generateErrorMsg(restResponse, errors);
        }
        return isImageExist;
    }
    
}
