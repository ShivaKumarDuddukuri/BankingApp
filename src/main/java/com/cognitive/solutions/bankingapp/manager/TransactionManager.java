package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.models.core.BankAccount;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;

public interface TransactionManager {


    ControllerResponse getBalance(int accountNumber);

    ControllerResponse getStatement(int accountNumber, Long fromDate, Long toDate);

    ControllerResponse addBeneficiary(BeneficiaryDetails beneficiaryDetails);

    ControllerResponse transfer(BankAccount bankAccount);
}