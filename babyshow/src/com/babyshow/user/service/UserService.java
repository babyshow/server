/*
 * 文 件 名:  UserService.java
 * 描    述:  UserService.java
 * 时    间:  2013-6-17
 */
package com.babyshow.user.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.babyshow.user.bean.User;
import com.babyshow.user.dao.UserDao;
import com.babyshow.util.UUIDGenerator;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Service
public class UserService
{
    @Autowired
    private UserDao userDao;
    
    /**
     * 
     * 根据userID查询User
     * 
     * @param userID
     * @return
     * @throws DataAccessException
     */
    public User findUserByUserID(String userID)
        throws DataAccessException
    {
        return this.userDao.findUserByUserID(userID);
    }
    
    /**
     * 
     * 插入User
     * 
     * @param user
     * @throws DataAccessException
     */
    public void insertUser(User user)
        throws DataAccessException
    {
        this.userDao.insertUser(user);
    }
    
    /**
     * 
     * 根据deviceID查User
     * 
     * @param deviceID
     * @return
     * @throws DataAccessException
     */
    public User findUserByDeviceID(String deviceID)
        throws DataAccessException
    {
        return this.userDao.findUserByDeviceID(deviceID);
    }
    
    /**
     * 
     * 用户第一次使用，根据deviceID新建用户
     * @param deviceID
     * @return
     */
    public User createNewUserByDeviceID(String deviceID)
    {
        User user = new User();
        user.setUserID(UUIDGenerator.generateUserID());
        user.setDeviceID(deviceID);
        user.setUserType("1");
        user.setStatus("0");
        user.setRegTime(new Date());
        this.userDao.insertUser(user);
        return user;
    }
}
