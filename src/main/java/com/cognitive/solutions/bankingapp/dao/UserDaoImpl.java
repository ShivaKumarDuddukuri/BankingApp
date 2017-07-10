package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.core.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory
            .getLogger(UserDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public boolean createUser(Customer customer) {
        String REGISTER = "INSERT INTO user ( user_id, name, password, email, dob, city, state, " +
                "country, pincode, phone) VALUES (?,?,?,?,?,?,?,?,?,?)";
        int rows = jdbcTemplate.update(REGISTER);
        return false;
    }
}