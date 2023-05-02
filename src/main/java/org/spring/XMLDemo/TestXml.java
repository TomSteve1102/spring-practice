package org.spring.XMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationXMLDao.xml");
        userDao userDao = context.getBean("userDao", userDao.class);
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
    }
}
