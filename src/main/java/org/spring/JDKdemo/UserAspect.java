package org.spring.JDKdemo;

public class UserAspect {
    public void check_permission() {
        System.out.println("模拟检查权限");
    }
    public void log() {
        System.out.println("模拟记录日志");
    }
}
