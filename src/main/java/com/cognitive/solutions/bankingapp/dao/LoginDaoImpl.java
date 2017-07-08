package com.cognitive.solutions.bankingapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class LoginDaoImpl implements LoginDao {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public LoginDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

}