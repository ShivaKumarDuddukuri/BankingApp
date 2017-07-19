package com.shiva.bankingapp.manager;

import com.shiva.bankingapp.dao.TransactionDao;
import com.shiva.bankingapp.models.core.Transaction;
import com.shiva.bankingapp.models.http.ControllerResponse;
import com.shiva.bankingapp.models.http.HttpResponseStatus;
import com.shiva.bankingapp.models.input.BeneficiaryDetails;
import com.shiva.bankingapp.models.output.BankStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionManagerImpl implements TransactionManager {

    private static final Logger logger = LoggerFactory
            .getLogger(TransactionManagerImpl.class);

    @Autowired
    private TransactionDao transactionDao;


    public ControllerResponse getBalance(int accountNumber) {
        return new ControllerResponse(HttpResponseStatus.SUCCESS, "Balance Retrieval Successfull", transactionDao.getBalance(accountNumber));
    }

    public ControllerResponse getStatement(int accountNumber, Long fromDate, Long toDate) {
        List<Transaction> transactions = transactionDao.getStatement(accountNumber, fromDate, toDate);
        BankStatement bankStatement = new BankStatement(accountNumber, transactions);
        return new ControllerResponse(HttpResponseStatus.SUCCESS, "Statement Retrieval Successfull", bankStatement);
    }

    public ControllerResponse addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
        if (transactionDao.addBeneficiary(beneficiaryDetails)) {
            return new ControllerResponse(HttpResponseStatus.SUCCESS, "Beneficiary Added Successfully");
        }
        return new ControllerResponse(HttpResponseStatus.FAILURE, "Beneficiary Addition Failed");
    }

    public ControllerResponse transfer(Transaction transaction) {
        if (transactionDao.transfer(transaction)) {
            return new ControllerResponse(HttpResponseStatus.SUCCESS, "Transfer Successfull");
        }
        return new ControllerResponse(HttpResponseStatus.FAILURE, "Transfer Failed");
    }
}