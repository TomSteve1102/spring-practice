package com.spring.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationJDBC.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        try {
            jdbcTemplate.execute("create table account(id int primary key auto_increment,name varchar(20),username varchar(20),password varchar(20), balance double)");
        } catch (DataAccessException e) {
            System.out.println("Table already exists");
        }
    }
}
