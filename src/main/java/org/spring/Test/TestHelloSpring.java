package org.spring.Test;

import org.spring.Service.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloSpring obj = (HelloSpring) context.getBean("HelloSpring");
        obj.getMessage();
    }
}
