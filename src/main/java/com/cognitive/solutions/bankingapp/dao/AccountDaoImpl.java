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
        String ADD_ACCOUNT = "INSERT INTO bank_accounts ( external_users_id , account_type , balance,hold,account_number ) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(ADD_ACCOUNT);
        return false;
    }
}