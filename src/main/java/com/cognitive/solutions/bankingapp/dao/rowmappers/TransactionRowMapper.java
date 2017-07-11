package com.cognitive.solutions.bankingapp.dao.rowmappers;

import com.cognitive.solutions.bankingapp.models.core.Transaction;
import com.cognitive.solutions.bankingapp.models.core.TransactionType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionRowMapper implements RowMapper<Transaction> {


    public Transaction mapRow(ResultSet resultSet, int i) throws SQLException {
        Transaction transaction = new Transaction();
        transaction.setAmount(resultSet.getBigDecimal(""));
        transaction.setCreatedAt(resultSet.getTimestamp("createdAt"));
        transaction.setUpdatedAt(resultSet.getTimestamp("updatedAt"));
        transaction.setPayee_id(resultSet.getInt("payee_id"));
        transaction.setPayer_id(resultSet.getInt("payer_id"));
        transaction.setTransaction_type(TransactionType.valueOf(resultSet.getString("transaction_type")));
        transaction.setStatus(resultSet.getString("status"));

        return null;
    }
}