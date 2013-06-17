package com.babyshow.user.service.impl;

import org.springframework.dao.DataAccessException;

import com.babyshow.user.bean.User;
import com.babyshow.user.dao.UserDao;
import com.babyshow.user.service.UserService;

public class UserServiceImpl implements UserService
{
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
    
    @Override
    public User findUserByUserID(String userID)
        throws DataAccessException
    {
        return this.userDao.findUser(userID);
    }
    
    @Override
    public void insertUser(User user)
        throws DataAccessException
    {
        this.userDao.insertUser(user);
    }
}
