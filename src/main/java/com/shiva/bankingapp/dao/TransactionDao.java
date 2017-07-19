package com.shiva.bankingapp.dao;

import com.shiva.bankingapp.models.core.Transaction;
import com.shiva.bankingapp.models.input.BeneficiaryDetails;
import com.shiva.bankingapp.models.output.BalanceInformation;

import java.util.List;

public interface TransactionDao {


    BalanceInformation getBalance(int accountNumber);

    List<Transaction> getStatement(int accountNumber, Long fromDate, Long toDate);

    boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails);

    boolean transfer(Transaction transaction);
}