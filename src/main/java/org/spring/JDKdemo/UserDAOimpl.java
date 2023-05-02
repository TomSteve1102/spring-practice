package org.spring.JDKdemo;

public class UserDAOimpl implements UserDAO{
    @Override
    public void add() {
        System.out.println("UserDAOimpl,add");
    }

    @Override
    public void delete() {
        System.out.println("UserDAOimpl,delete");
    }
}
