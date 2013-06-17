/*
 * 文 件 名:  UserService.java
 * 描    述:  UserService.java
 * 时    间:  2013-6-17
 */
package com.babyshow.user.service;

import org.springframework.dao.DataAccessException;

import com.babyshow.user.bean.User;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public interface UserService
{
    /**
     * 
     * 根据userID查询User
     * 
     * @param userID
     * @return
     * @throws DataAccessException
     */
    public User findUserByUserID(String userID)
        throws DataAccessException;
    
    /**
     * 
     * 插入User
     * 
     * @param user
     * @throws DataAccessException
     */
    public void insertUser(User user)
        throws DataAccessException;
}
