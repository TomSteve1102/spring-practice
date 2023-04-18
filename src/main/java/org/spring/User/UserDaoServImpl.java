package org.spring.User;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userDaoServ")
public class UserDaoServImpl implements UserDaoServ {
    @Resource(name = "userDao")
    private UserDao userDao;
    public void save() {
        this.userDao.save();
        System.out.println("UserDaoServImpl,保存用户");
    }
}
