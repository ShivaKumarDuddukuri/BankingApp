package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TransactionDaoImpl implements TransactionDao {

    private static final Logger logger = LoggerFactory
            .getLogger(TransactionDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public TransactionDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public BalanceInformation getBalance(int accountNumber) {
        return null;
    }

    public BankStatement getStatement(int accountNumber, Long fromDate, Long toDate) {
        return null;
    }

    public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
        return false;
    }
}