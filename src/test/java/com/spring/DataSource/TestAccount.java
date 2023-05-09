package com.spring.DataSource;

import org.junit.Test;
import org.spring.jdbc.account;
import org.spring.jdbc.dao.accountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
    @Test
    public void addAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationJDBC.xml");
        accountDao accountDao = (accountDao) context.getBean("accountDao");
        account account = new account();
        account.setName("Tom");
        account.setBalance(1000.0);
        int num = accountDao.addAccount(account);
        if (num > 0) {
            System.out.println("Add account successfully");
        } else {
            System.out.println("Add account failed");
        }
    }

    @Test
    public void UpdateAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationJDBC.xml");
        accountDao accountDao = (accountDao) context.getBean("accountDao");
        account account = new account();
        account.setId(1);
        account.setName("Tom");
        account.setBalance(2000.0);
        int num = accountDao.updateAccount(account);
        if (num > 0) {
            System.out.println("Update account successfully");
        } else {
            System.out.println("Update account failed");
        }
    }

    @Test
    public void DeleteAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationJDBC.xml");
        accountDao accountDao = (accountDao) context.getBean("accountDao");
        int num = accountDao.deleteAccount(1);
        if (num > 0) {
            System.out.println("Delete account successfully");
        } else {
            System.out.println("Delete account failed");
        }
    }

    @Test
    public void FindAccountById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationJDBC.xml");
        accountDao accountDao = (accountDao) context.getBean("accountDao");
        account account = accountDao.findAccountById(2);
        System.out.println(account);
    }

    @Test
    public void FindAllAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationJDBC.xml");
        accountDao accountDao = (accountDao) context.getBean("accountDao");
        System.out.println(accountDao.findAllAccount());
    }

    @Test
    public void Transfer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationJDBC.xml");
        accountDao accountDao = (accountDao) context.getBean("accountDao");
        accountDao.transfer("Tom", "Jerry", 100.0);
        System.out.println("Transfer successfully");
    }

    @Test
    public void annotation_Transfer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        accountDao accountDao = (accountDao) context.getBean("accountDao");
        accountDao.transfer("Tom", "Jerry", 100.0);
        System.out.println("Transfer successfully");
    }
}
