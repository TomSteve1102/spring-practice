package org.spring.CGLibDemo;

import org.spring.JDKdemo.UserAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {
    public Object createProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        UserAspect userAspect = new UserAspect();
        userAspect.check_permission();
        Object obj = methodProxy.invokeSuper(proxy, args);
        userAspect.log();
        return obj;
    }

}
