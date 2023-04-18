package org.spring.Bean;

public class Bean3Factory {
    public Bean3Factory() {
        System.out.println("Bean3Factory,实例化");
    }
    public Bean3 createBean3() {
        System.out.println("Bean3Factory,创建Bean3");
        return new Bean3();
    }
}
