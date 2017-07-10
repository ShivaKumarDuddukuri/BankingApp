package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class RegistrationDaoImpl implements RegistrationDao {

    private static final Logger logger = LoggerFactory
            .getLogger(RegistrationDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserDao userDao;

    @Autowired
    private AccountDao accountDao;

    public RegistrationDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public boolean register(RegistrationInfo registrationInfo) {

        if (!userDao.createUser(registrationInfo.getCustomer())) {
            return false;
        }
        if (accountDao.createAccount(registrationInfo)) {
            return true;
        }
        return false;
    }

}