/*
 * �� �� ��:  UserService.java
 * ��    ��:  UserService.java
 * ʱ    ��:  2013-6-17
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
 * <һ�仰���ܼ���> <������ϸ����>
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
     * ����userID��ѯUser
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
     * ����User
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
     * ����deviceID��User
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
     * �û���һ��ʹ�ã�����deviceID�½��û�
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
