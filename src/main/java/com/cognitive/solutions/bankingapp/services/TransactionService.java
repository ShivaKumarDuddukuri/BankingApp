package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.models.core.Transaction;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;

public interface TransactionService {


    ControllerResponse getBalance(int accountNumber);

    ControllerResponse getStatement(int accountNumber, Long fromDate, Long toDate);

    ControllerResponse addBeneficiary(BeneficiaryDetails beneficiaryDetails);

    ControllerResponse transfer(Transaction transaction);
}