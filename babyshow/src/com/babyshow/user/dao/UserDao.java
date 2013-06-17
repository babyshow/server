/*
 * �� �� ��:  UserDao.java
 * ��    ��:  UserDao.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.user.dao;

import com.babyshow.user.bean.User;

/**
 * <һ�仰���ܼ���>
 * <������ϸ����>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-17]
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
    public User findUser(String userID);
    
    /**
     * 
     * ����user 
     * 
     * @param user
     */
    public void insertUser(User user);
    
}
