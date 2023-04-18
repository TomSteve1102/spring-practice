package org.spring.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationStudent.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

        // Destory
        AbstractApplicationContext abstractApplicationContext = (AbstractApplicationContext) context;
        abstractApplicationContext.registerShutdownHook();
    }
}
