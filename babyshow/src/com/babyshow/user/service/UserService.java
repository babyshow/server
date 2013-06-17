/*
 * �� �� ��:  UserService.java
 * ��    ��:  UserService.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.user.service;

import org.springframework.dao.DataAccessException;

import com.babyshow.user.bean.User;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public interface UserService
{
    /**
     * 
     * ����userID��ѯUser
     * 
     * @param userID
     * @return
     * @throws DataAccessException
     */
    public User findUserByUserID(String userID)
        throws DataAccessException;
    
    /**
     * 
     * ����User
     * 
     * @param user
     * @throws DataAccessException
     */
    public void insertUser(User user)
        throws DataAccessException;
}
