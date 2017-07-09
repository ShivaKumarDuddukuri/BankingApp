package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.TransactionManager;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    private static final Logger logger = LoggerFactory
            .getLogger(TransactionServiceImpl.class);

    @Autowired
    private TransactionManager transactionManager;


    public ControllerResponse getBalance(int accountNumber) {
        BalanceInformation balanceInformation = transactionManager.getBalance(accountNumber);
        return null;
    }

    public ControllerResponse getStatement(int accountNumber, Long fromDate, Long toDate) {
        BankStatement bankStatement = transactionManager.getStatement(accountNumber, fromDate, toDate);
        return null;
    }

    public ControllerResponse addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
        boolean addedBeneficiary = transactionManager.addBeneficiary(beneficiaryDetails);
        return null;
    }
}