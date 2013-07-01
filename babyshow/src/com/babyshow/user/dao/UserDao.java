/*
 * �� �� ��:  UserDao.java
 * ��    ��:  UserDao.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.user.dao;

import java.util.Date;

import com.babyshow.user.bean.User;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public interface UserDao
{
    
    /**
     * 
     * ����userID��User
     * 
     * @param userID
     * @return
     */
    public User findUserByUserID(String userID);
    
    /**
     * 
     * ����user
     * 
     * @param user
     */
    public void insertUser(User user);
    
    /**
     * 
     * ����deviceID��User
     * 
     * @param deviceID
     * @return
     */
    public User findUserByDeviceID(String deviceID);
    
    /**
     * 
     * ��ѯ���ڵ��û�����
     * 
     * @return
     */
    public int findExistUserCount();
    
    /**
     * ����deviceID�����ڲ�ѯ�û�����Baby��Ƭ��ָ������ǰ��ϲ���Ĵ���
     * 
     * @param deviceID
     * @return
     */
    public int findUserBabyLikeCountByDeviceIDAndDate(String deviceID, Date date);
    
}
