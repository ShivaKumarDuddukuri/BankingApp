package com.cognitive.solutions.bankingapp.dao.rowmappers;

import com.cognitive.solutions.bankingapp.models.core.CurrencyType;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BalanceInfoRowMapper implements RowMapper<BalanceInformation> {


    public BalanceInformation mapRow(ResultSet resultSet, int i) throws SQLException {
        BalanceInformation balanceInformation = new BalanceInformation();
        balanceInformation.setAccountNumber(resultSet.getInt(""));
        balanceInformation.setAmount(resultSet.getInt(""));
        balanceInformation.setCurrencyType(CurrencyType.valueOf(resultSet.getString("")));
        return balanceInformation;
    }
}