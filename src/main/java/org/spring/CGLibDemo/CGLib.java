package org.spring.CGLibDemo;

import org.spring.JDKdemo.UserDAO;
import org.spring.JDKdemo.UserDAOimpl;

public class CGLib {
    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        UserDAO userDAO = new UserDAOimpl();
        UserDAO userDAOProxy = (UserDAO) cgLibProxy.createProxy(userDAO);
        userDAOProxy.add();
        userDAOProxy.delete();
    }
}
