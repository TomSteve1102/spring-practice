package org.spring.Service.impl;

import org.spring.Service.Userservice;
import org.spring.dao.UserDao;

public class UserService implements Userservice {
    UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}
