/*
 * 文 件 名:  UserDao.java
 * 描    述:  UserDao.java
 * 时    间:  2013-6-17
 */
package com.babyshow.user.dao;

import com.babyshow.user.bean.User;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public interface UserDao
{
    
    /**
     * 
     * 根据userID查User
     * 
     * @param userID
     * @return
     */
    public User findUserByUserID(String userID);
    
    /**
     * 
     * 插入user
     * 
     * @param user
     */
    public void insertUser(User user);
    
    /**
     * 
     * 根据deviceID查User
     * 
     * @param deviceID
     * @return
     */
    public User findUserByDeviceID(String deviceID);
}
