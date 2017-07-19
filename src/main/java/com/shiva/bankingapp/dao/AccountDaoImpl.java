package com.shiva.bankingapp.dao;

import com.shiva.bankingapp.models.input.RegistrationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

public class AccountDaoImpl implements AccountDao {

    private static final Logger logger = LoggerFactory
            .getLogger(AccountDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public AccountDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Transactional
    public boolean createAccount(RegistrationInfo registrationInfo) {
        logger.info("creating  Account in AccountDaoImpl");
        String ADD_ACCOUNT = " INSERT INTO account_details (  user_id, balance , currency_type ) VALUES (?,?,?) ";
        Object[] params = new Object[]{registrationInfo.getCustomer().getId(), registrationInfo.getBalance(), registrationInfo.getCurrencyType().ordinal()};
        int rows = jdbcTemplate.update(ADD_ACCOUNT, params);
        return rows >= 1;
    }
}