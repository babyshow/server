/*
 * 文 件 名:  UserLoginLogDao.java
 * 描    述:  UserLoginLogDao.java
 * 时    间:  2013-6-30
 */
package com.babyshow.user.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-30]
 */
public interface UserLoginLogDao
{
    /**
     * 
     * 根据deviceID查询用户最后一次登录时间
     * 
     * @param deviceID
     * @return
     */
    public Date findUserLastLoginTimeByDeviceID(String deviceID); 
    
    /**
     * 
     * 写入用户登录时间
     * 
     * @param userCode
     * @param date
     */
    public void insertUserLoginTime(@Param("userCode") String userCode, @Param("date") Date date);
}
