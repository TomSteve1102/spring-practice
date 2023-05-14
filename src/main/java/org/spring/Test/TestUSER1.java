package org.spring.Test;

import org.spring.Service.USER1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUSER1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext-USER.xml");
        USER1 obj = context.getBean("USER1", USER1.class);
        System.out.println(obj);
    }
}
