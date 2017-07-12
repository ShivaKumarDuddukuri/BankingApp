package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.dao.rowmappers.BalanceInfoRowMapper;
import com.cognitive.solutions.bankingapp.models.core.Transaction;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TransactionDaoImpl implements TransactionDao {

    private static final Logger logger = LoggerFactory
            .getLogger(TransactionDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    public TransactionDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public BalanceInformation getBalance(int accountNumber) {
        String GET_BALANCE = "SELECT * FROM account_details WHERE account_id = ?";
        try {
            return jdbcTemplate.queryForObject(GET_BALANCE, new Object[]{accountNumber}, new BalanceInfoRowMapper());
        } catch (DataAccessException dae) {
            logger.error(" ");
        }
        return null;
    }

    public List<Transaction> getStatement(int accountNumber, Long fromDate, Long toDate) {
        String GET_STATEMENT = "SELECT * FROM transaction_details WHERE payer_id = ? AND createdAt = ? AND updatedAt = ?";
        try {
            return jdbcTemplate.queryForList(GET_STATEMENT, new Object[]{accountNumber, fromDate, toDate}, Transaction.class);
        } catch (DataAccessException dae) {
            logger.error(" ");
        }
        return null;
    }


    public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
        String ADD_BENEFICIARY = "INSERT INTO beneficiary VALUES (?,?)";
        return (jdbcTemplate.update(ADD_BENEFICIARY,
                new Object[]{beneficiaryDetails.getAccountId(), beneficiaryDetails.getBeneficiaryId()}) > 0 ? true
                : false);
    }

    public boolean transfer(Transaction transaction) {
        String ADD_TRANSACTION = "INSERT INTO transaction_details VALUES(?,?,?,?,?,?,?,?)";
        return (jdbcTemplate.update(ADD_TRANSACTION,
                new Object[]{transaction.getPayer_id(), transaction.getPayee_id(), transaction.getAmount(),
                        transaction.getTransaction_type().toString(), transaction.getDescription(),
                        transaction.getStatus(), transaction.getCreatedAt(), transaction.getUpdatedAt()}) > 0 ? true
                : false);
    }
}