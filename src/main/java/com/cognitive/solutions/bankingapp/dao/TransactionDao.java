package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.core.BankAccount;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;

public interface TransactionDao {


    BalanceInformation getBalance(int accountNumber);

    BankStatement getStatement(int accountNumber, Long fromDate, Long toDate);

    boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails);

    boolean transfer(BankAccount bankAccount);
}