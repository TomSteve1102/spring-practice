package org.spring.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationUser.xml");
        UserDaoServControl control = (UserDaoServControl) context.getBean("userDaoServControl");
        control.save();
    }
}
