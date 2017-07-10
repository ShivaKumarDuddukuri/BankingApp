package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.dao.rowmappers.BalanceInfoRowMapper;
import com.cognitive.solutions.bankingapp.dao.rowmappers.BankStatementRowMapper;
import com.cognitive.solutions.bankingapp.models.core.BankAccount;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
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
        String GET_BALANCE = " ";
        try {
            return jdbcTemplate.queryForObject(GET_BALANCE, new BalanceInfoRowMapper());
        } catch (DataAccessException dae) {
            logger.error(" ");
        }
        return null;
    }

    public BankStatement getStatement(int accountNumber, Long fromDate, Long toDate) {
        String GET_STATEMENT = " ";
        try {
            return jdbcTemplate.queryForObject(GET_STATEMENT, new BankStatementRowMapper());
        } catch (DataAccessException dae) {
            logger.error(" ");
        }
        return null;
    }

    public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
        String ADD_BENEFICIARY = "INSERT INTO bank_accounts ( external_users_id , account_type , balance,hold,account_number ) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(ADD_BENEFICIARY);
        return false;
    }

    public boolean transfer(BankAccount bankAccount) {
        return false;
    }
}