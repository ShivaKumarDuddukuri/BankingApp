package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.core.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory
            .getLogger(UserDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public boolean createUser(Customer customer) {
        String CREATE_USER = " INSERT INTO user ( user_id, name, password, email, dob, city, state, " +
                " country, pincode, phone) VALUES (?,?,?,?,?,?,?,?,?,?) ";
        java.sql.Date sqlDate = null;
        try {
            Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(customer.getDate_of_birth());
            sqlDate = new java.sql.Date(utilDate.getTime());
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        Object[] params = new Object[]{customer.getId(), customer.getName(), customer.getPassword(), customer.getEmail(),
                sqlDate, customer.getCity(), customer.getState(), customer.getCountry(), customer.getPincode(), customer.getPhone()};

        int rows = jdbcTemplate.update(CREATE_USER, params);
        return rows >= 1;
    }
}