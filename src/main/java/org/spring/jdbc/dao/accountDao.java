package org.spring.jdbc.dao;

import org.spring.jdbc.account;

import java.util.List;

public interface accountDao {
    int addAccount(account account);
    int updateAccount(account account);
    int deleteAccount(int id);
    account findAccountById(int id);
    List<account> findAllAccount();
    void transfer(String outUser, String inUser, Double money);
}
