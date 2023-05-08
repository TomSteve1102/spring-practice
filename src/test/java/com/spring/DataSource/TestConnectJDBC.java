package com.spring.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.DriverManagerDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnectJDBC {
    @Test
    public void testByc3p0() throws SQLException {
        //Properties for c3p0
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClass("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC&useSSL=false");
        ds.setUser("root");
        ds.setPassword("******");
        //Get connection
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }

    @Test
    public void testByDruid() throws SQLException {
        //Properties for Druid
        Connection conn;
        try (DruidDataSource ds = new DruidDataSource()) {
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds.setUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC&useSSL=false");
            ds.setUsername("root");
            ds.setPassword("******");
            //Get connection
            conn = ds.getConnection();
        }
        System.out.println(conn);
    }
}
