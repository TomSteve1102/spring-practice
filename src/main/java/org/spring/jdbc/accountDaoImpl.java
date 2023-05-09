package org.spring.jdbc;

import org.jetbrains.annotations.NotNull;
import org.spring.jdbc.dao.accountDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class accountDaoImpl implements accountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAccount(@NotNull account account) {
        String sql = "insert into account(username, balance) values(?, ?)";
        Object[] args = {account.getName(), account.getBalance()};
        return this.jdbcTemplate.update(sql, args);
    }

    @Override
    public int updateAccount(account account) {
        String sql = "update account set username=?, balance=? where id=?";
        Object[] args = {account.getName(), account.getBalance(), account.getId()};
        return this.jdbcTemplate.update(sql, args);
    }

    @Override
    public int deleteAccount(int id) {
        String sql = "delete from account where id=?";
        return this.jdbcTemplate.update(sql, id);
    }

    @Override
    public account findAccountById(int id) {
        String sql = "select * from account where id=?";
        RowMapper<account> rowMapper = new BeanPropertyRowMapper<>(account.class);
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<account> findAllAccount() {
        String sql = "select * from account";
        RowMapper<account> rowMapper = new BeanPropertyRowMapper<>(account.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    /*
     *    transfer method:
     *    outUser: 转出账户
     *    inUser: 转入账户
     *    money: 转账金额
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        // 转出账户减钱
        String sqlOut = "update account set balance=balance-? where username=?";
        this.jdbcTemplate.update(sqlOut, money, outUser);

        // 模拟异常
//        int i = 1 / 0;

        // 转入账户加钱
        String sqlIn = "update account set balance=balance+? where username=?";
        this.jdbcTemplate.update(sqlIn, money, inUser);
    }
}
