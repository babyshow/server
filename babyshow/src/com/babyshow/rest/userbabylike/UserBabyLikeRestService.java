/*
 * �� �� ��:  UserBabyLikeRestService.java
 * ��    ��:  UserBabyLikeRestService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.rest.userbabylike;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.user.service.UserLoginLogService;
import com.babyshow.user.service.UserService;

/**
 * <һ�仰���ܼ���>
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
     * �����ѯBaby��Ƭ��ϲ�������ӿ�
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
