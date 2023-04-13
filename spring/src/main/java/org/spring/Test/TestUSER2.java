package org.spring.Test;

import org.spring.Service.user2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUSER2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext-USER2.xml");
        user2 user2 = context.getBean("user2",user2.class);
        System.out.println(user2);
    }
}
