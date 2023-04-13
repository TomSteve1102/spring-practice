package org.spring.dao.impl;

import org.jetbrains.annotations.NotNull;
import org.spring.dao.UserDao;

public class User implements UserDao {
    @Override
    public boolean login(@NotNull String name,@NotNull String password){
        return name.equals("张三") && password.equals("123456");
    }
}
