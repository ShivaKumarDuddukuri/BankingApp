package com.shiva.bankingapp.dao.rowmappers;

import com.shiva.bankingapp.models.core.Transaction;
import com.shiva.bankingapp.models.core.TransactionType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionRowMapper implements RowMapper<Transaction> {

	public Transaction mapRow(ResultSet resultSet, int i) throws SQLException {
		Transaction transaction = new Transaction();
		transaction.setAmount(resultSet.getBigDecimal("amount"));
		transaction.setCreatedAt(resultSet.getTimestamp("createdAt"));
		transaction.setUpdatedAt(resultSet.getTimestamp("updatedAt"));
		transaction.setPayee_id(resultSet.getInt("payee_id"));
		transaction.setPayer_id(resultSet.getInt("payer_id"));
		transaction.setTransaction_type(TransactionType.values()[resultSet.getInt("transaction_type")]);
		transaction.setStatus(resultSet.getString("status"));
		return transaction;
	}

}