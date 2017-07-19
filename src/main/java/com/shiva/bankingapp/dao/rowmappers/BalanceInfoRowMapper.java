package com.shiva.bankingapp.dao.rowmappers;

import com.shiva.bankingapp.models.core.CurrencyType;
import com.shiva.bankingapp.models.output.BalanceInformation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BalanceInfoRowMapper implements RowMapper<BalanceInformation> {

	public BalanceInformation mapRow(ResultSet resultSet, int i) throws SQLException {
		BalanceInformation balanceInformation = new BalanceInformation();
		balanceInformation.setAccountNumber(resultSet.getInt("account_id"));
		balanceInformation.setAmount(resultSet.getInt("balance"));
		CurrencyType currencyType = CurrencyType.values()[resultSet.getInt("currency_type")];
		balanceInformation.setCurrencyType(currencyType);
		return balanceInformation;
	}

}