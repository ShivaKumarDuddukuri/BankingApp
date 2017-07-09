package com.cognitive.solutions.bankingapp.dao.rowmappers;

import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankStatementRowMapper implements RowMapper<BankStatement> {


    public BankStatement mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}