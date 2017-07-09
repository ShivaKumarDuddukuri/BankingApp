package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;

public interface TransactionManager {


    BalanceInformation getBalance(int accountNumber);

    BankStatement getStatement(int accountNumber, Long fromDate, Long toDate);

    boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails);
}