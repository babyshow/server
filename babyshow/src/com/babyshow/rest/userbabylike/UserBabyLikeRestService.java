/*
 * 文 件 名:  UserBabyLikeRestService.java
 * 描    述:  UserBabyLikeRestService.java
 * 时    间:  2013-6-30
 */
package com.babyshow.rest.userbabylike;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.user.service.UserLoginLogService;
import com.babyshow.user.service.UserService;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserBabyLikeRestService
{
    @Autowired
    private UserLoginLogService userLoginLogService;
    
    @Autowired
    private UserService userService;
    
    /**
     * 
     * 处理查询Baby照片被喜欢次数接口
     * 
     * @param userBabyLikeRequest
     * @return
     */
    public UserBabyLikeResponse handleUserBabyLike(UserBabyLikeRequest userBabyLikeRequest)
    {
        UserBabyLikeResponse userBabyLikeResponse = new UserBabyLikeResponse();
        String deviceID = userBabyLikeRequest.getDevice_id();
        int totalCount = this.userService.findUserBabyLikeCountByDeviceID(deviceID);
        Date preDate = this.userLoginLogService.findUserLastLoginTimeByDeviceID(deviceID);
        int newLikeCount = this.userService.findUserBabyLikeIncreaseByDeviceIDAndTime(deviceID, preDate);
        userBabyLikeResponse.setTotalLikeCount(totalCount);
        userBabyLikeResponse.setNewLikeCount(newLikeCount);
        return userBabyLikeResponse;
    }
}
