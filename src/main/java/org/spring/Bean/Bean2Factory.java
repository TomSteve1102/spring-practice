package org.spring.Bean;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Bean2Factory {
    @Contract(" -> new")
    public static @NotNull Bean2 createBean2() {
        System.out.println("Bean2Factory,创建Bean2");
        return new Bean2();
    }
}
