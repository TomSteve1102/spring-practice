package org.spring.Student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationStudent.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

        // Destroy
        context.registerShutdownHook();
    }
}
