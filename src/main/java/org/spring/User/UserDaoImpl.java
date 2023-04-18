package org.spring.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationBean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        System.out.println("UserDaoImpl,保存用户");
    }
}
