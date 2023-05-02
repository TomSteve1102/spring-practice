package org.spring.JDKdemo;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserProxy implements InvocationHandler{
    private UserDAO userDAO;

    public Object createProxy(@NotNull UserDAO userDAO) {
        this.userDAO = userDAO;
        ClassLoader classLoader = UserProxy.class.getClassLoader();
        Class[] classes = userDAO.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, classes, this);
    }

    public Object invoke(Object proxy, @NotNull Method method, Object[] args) throws Throwable {
        UserAspect userAspect = new UserAspect();
        userAspect.check_permission();
        Object obj = method.invoke(userDAO, args);
        userAspect.log();
        return obj;
    }
}
