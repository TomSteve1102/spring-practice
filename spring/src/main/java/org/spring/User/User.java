package org.spring.User;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("singleton")
public class User {
    @Value("张三")
    private String name;
    @Value("123456")
    private String password;
    @Value("123@456.cc")
    private String email;
    @Value("12345678901")
    private String phone;

    public User() {
        System.out.println("User,实例化");
    }

    public User(String name, String password, String email, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
    }
}
