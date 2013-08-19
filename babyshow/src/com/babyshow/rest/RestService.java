/*
 * �� �� ��:  RestService.java
 * ��    ��:  RestService.java
 * ʱ    ��:  2013-8-14
 */
package com.babyshow.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.babyshow.image.service.ImageService;
import com.babyshow.user.service.UserService;
import com.babyshow.util.PropertiesUtil;

/**
 * �̳и���ɸ���У�鷽��
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
     * У���û������ڷ���true�������ڷ���false
     * <br>
     * У��ʧ��ʱrestResponse��д�������ʹ�����Ϣ
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
     * У��ͼƬ�����ڷ���true�������ڷ���false
     * <br>
     * У��ʧ��ʱrestResponse��д�������ʹ�����Ϣ
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
