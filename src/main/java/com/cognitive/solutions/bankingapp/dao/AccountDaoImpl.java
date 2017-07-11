package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class AccountDaoImpl implements AccountDao {

    private static final Logger logger = LoggerFactory
            .getLogger(AccountDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public AccountDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public boolean createAccount(RegistrationInfo registrationInfo) {
        String ADD_ACCOUNT = " INSERT INTO account_details (  user_id, balance , currency_type ) VALUES (?,?,?) ";
        Object[] params = new Object[]{registrationInfo.getUserId(), registrationInfo.getBalance(), registrationInfo.getCurrencyType()};
        int rows = jdbcTemplate.update(ADD_ACCOUNT, params);
        return rows >= 1;
    }
}