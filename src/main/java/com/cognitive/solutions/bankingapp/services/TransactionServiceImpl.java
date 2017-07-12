package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.TransactionManager;
import com.cognitive.solutions.bankingapp.models.core.Transaction;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.http.HttpResponseStatus;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
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
        if (accountNumber <= 0) {
            new ControllerResponse(HttpResponseStatus.INVALID_ACCOUNT_NUMBER, "Invalid Account Number");
        }
        return transactionManager.getBalance(accountNumber);
    }

    public ControllerResponse getStatement(int accountNumber, Long fromDate, Long toDate) {
        if (accountNumber <= 0) {
            new ControllerResponse(HttpResponseStatus.INVALID_ACCOUNT_NUMBER, "Invalid Account Number");
        }
        if (fromDate <= 0) {
            new ControllerResponse(HttpResponseStatus.INVALID_DATE, "Invalid Date");
        }
        if (toDate <= 0) {
            new ControllerResponse(HttpResponseStatus.INVALID_DATE, "Invalid Date");
        }
        return transactionManager.getStatement(accountNumber, fromDate, toDate);
    }

    public ControllerResponse addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
        if (beneficiaryDetails == null) {
            new ControllerResponse(HttpResponseStatus.INVALID_BENEFICIARY, "Invalid Beneficiary Info");
        }
        if (beneficiaryDetails.getAccountId() <= 0) {
            new ControllerResponse(HttpResponseStatus.INVALID_ACCOUNT_NUMBER, "Invalid Account Number");
        }
        if (beneficiaryDetails.getBeneficiaryId() <= 0) {
            new ControllerResponse(HttpResponseStatus.INVALID_ACCOUNT_NUMBER, "Invalid Beneficiary Id");
        }
        return transactionManager.addBeneficiary(beneficiaryDetails);
    }

    public ControllerResponse transfer(Transaction transaction) {
        if (transaction.getPayee_id()<=0) {
            new ControllerResponse(HttpResponseStatus.INVALID_BANK_ACCOUNT, "Invalid Bank Account");
        }
        if (transaction.getPayer_id()<=0) {
            new ControllerResponse(HttpResponseStatus.INVALID_BANK_ACCOUNT, "Invalid Bank Account");
        }
        return transactionManager.transfer(transaction);
    }
}