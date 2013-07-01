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
     * ��ѯ�����û�������
     * 
     * @return
     */
    public int findExistUserCount()
    {
        return this.userDao.findExistUserCount();
    }
    
    /**
     * 
     * ����deviceID�ж��û��Ƿ����
     * 
     * @param deviceID
     * @return ���ڣ�true �����ڣ�false
     * 
     */
    public Boolean isUserExistByDeviceID(String deviceID)
    {
        return !(findUserByDeviceID(deviceID) == null);
    }
    
    /**
     * 
     * �û���һ��ʹ�ã�����deviceID�½��û�
     * 
     * @param deviceID
     * @return
     */
    public User addNewUserByDeviceID(String deviceID)
    {
        User user = new User();
        int regnum = findExistUserCount();
        user.setUserCode(UUIDGenerator.generateUserCode());
        user.setDeviceID(deviceID);
        user.setUserType("1");
        user.setStatus("0");
        user.setRegTime(new Date());
        user.setRegNum(regnum + 1);
        this.userDao.insertUser(user);
        return user;
    }
    
    /**
     * 
     * ���ݵ�ǰʱ��deviceID��ѯ�û�������Ƭ��ϲ������
     * 
     * @param deviceID
     * @return
     */
    public int findUserBabyLikeCountByDeviceID(String deviceID)
    {
        Date date = new Date();
        return this.userDao.findUserBabyLikeCountByDeviceIDAndDate(deviceID, date);
    }
    
    /**
     * 
     * ����deviceID���ϴ�ʱ���ѯ�û�������Ƭ������ϲ������
     * 
     * @param deviceID
     * @param preDate
     * @return
     */
    public int findUserBabyLikeIncreaseByDeviceIDAndTime(String deviceID, Date preDate)
    {
        Date date = new Date();
        int count = this.userDao.findUserBabyLikeCountByDeviceIDAndDate(deviceID, date)
            - this.userDao.findUserBabyLikeCountByDeviceIDAndDate(deviceID, preDate);
        return Math.abs(count);
    }
    
    
    
    
}
