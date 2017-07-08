package com.cognitive.solutions.bankingapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

public class TransactionDaoImpl implements TransactionDao {

    private static final Logger logger = LoggerFactory
            .getLogger(TransactionDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public TransactionDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

}