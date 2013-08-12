/*
 * 文 件 名:  UserLoginLogService.java
 * 描    述:  UserLoginLogService.java
 * 时    间:  2013-6-30
 */
package com.babyshow.user.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.user.dao.UserLoginLogDao;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserLoginLogService
{
    @Autowired
    private UserLoginLogDao userLoginLogDao;
    
    /**
     * 
     * 根据deviceID查询用户最后一次登录时间
     * 
     * @param deviceID
     * @return
     */
    public Date findUserLastLoginTimeByDeviceID(String deviceID)
    {
        return this.userLoginLogDao.findUserLastLoginTimeByDeviceID(deviceID);
    }
    
    /**
     * 
     * 写入用户登录时间
     * 
     * @param userCode
     * @param date
     */
    public void insertUserLoginTime(String userCode, Date date)
    {
        this.userLoginLogDao.insertUserLoginTime(userCode, date);
    }
}
