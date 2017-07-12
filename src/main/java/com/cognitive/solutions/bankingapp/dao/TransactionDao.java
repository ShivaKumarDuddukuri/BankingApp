package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.core.BankAccount;
import com.cognitive.solutions.bankingapp.models.core.Transaction;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;

import java.util.List;

public interface TransactionDao {


    BalanceInformation getBalance(int accountNumber);

    List<Transaction> getStatement(int accountNumber, Long fromDate, Long toDate);

    boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails);

    boolean transfer(Transaction transaction);
}