package org.spring.Test;

import org.spring.Bean.Bean1;
import org.spring.Bean.Bean2;
import org.spring.Bean.Bean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testbean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationBean.xml");
        // Bean1
        Bean1 bean1 = (Bean1) context.getBean("bean1");
        System.out.println(bean1);
        // Bean2
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        System.out.println(bean2);
        // Bean3
        Bean3 bean3 = (Bean3) context.getBean("bean3");
        System.out.println(bean3);
    }
}
