package org.spring.StudentJDBC;

import org.spring.StudentJDBC.Dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        System.out.println("Welcome to StudentController!");
        System.out.println("Please input your username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("student.xml");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
        List<Student> students = studentDao.findAllStudent();
        for (Student s : students) {
            if (username.equals(s.getUsername())) {
                System.out.println("Please input your password:");
                String password = scanner.nextLine();
                if (password.equals(s.getPassword())){
                    System.out.println("Login Successfully!");
                    System.out.println(s.getUsername()+" is in class "+s.getCourse());
                } else {
                    System.out.println("Login unsuccessful, please check your password");
                }
            }
        }
    }
}
