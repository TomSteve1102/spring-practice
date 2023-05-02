package org.spring.JDKdemo;

public class User {
    public static void main(String[] args) {
        UserProxy userProxy = new UserProxy();
        UserDAO userDAO = new UserDAOimpl();
        UserDAO userDAOProxy = (UserDAO) userProxy.createProxy(userDAO);
        userDAOProxy.add();
        userDAOProxy.delete();
    }
}
