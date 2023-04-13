package org.spring.dao;

import org.jetbrains.annotations.NotNull;

public interface UserDao {
    boolean login(@NotNull String name,@NotNull String password);
}
