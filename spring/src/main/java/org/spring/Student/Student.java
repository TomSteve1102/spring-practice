package org.spring.Student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("student")
public class Student {
    @Value("张三")
    private String name;
    @Value("123456")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Student,实例化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Student,销毁");
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + '}';
    }
}
