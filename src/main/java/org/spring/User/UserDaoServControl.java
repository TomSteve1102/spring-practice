package org.spring.User;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserDaoServControl {
    @Resource(name = "userDaoServ")
    private UserDaoServ userDaoServ;
    public void save() {
        this.userDaoServ.save();
        System.out.println("UserDaoServControl,保存用户");
    }
}
