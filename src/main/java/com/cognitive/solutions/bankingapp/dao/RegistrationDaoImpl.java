package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class RegistrationDaoImpl implements RegistrationDao {

    private static final Logger logger = LoggerFactory
            .getLogger(RegistrationDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public RegistrationDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public boolean register(RegistrationInfo registrationInfo) {
        String REGISTER = "INSERT INTO bank_accounts ( external_users_id , account_type , balance,hold,account_number ) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(REGISTER);
        return false;
    }
}