package com.shiva.bankingapp.services;

import com.shiva.bankingapp.models.core.Transaction;
import com.shiva.bankingapp.models.http.ControllerResponse;
import com.shiva.bankingapp.models.input.BeneficiaryDetails;

public interface TransactionService {


    ControllerResponse getBalance(int accountNumber);

    ControllerResponse getStatement(int accountNumber, Long fromDate, Long toDate);

    ControllerResponse addBeneficiary(BeneficiaryDetails beneficiaryDetails);

    ControllerResponse transfer(Transaction transaction);
}