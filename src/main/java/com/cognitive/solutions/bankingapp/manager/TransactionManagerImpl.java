package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.TransactionDao;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.models.output.BalanceInformation;
import com.cognitive.solutions.bankingapp.models.output.BankStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionManagerImpl implements TransactionManager {

    private static final Logger logger = LoggerFactory
            .getLogger(TransactionManagerImpl.class);

    @Autowired
    private TransactionDao transactionDao;


    public BalanceInformation getBalance(int accountNumber) {
        return transactionDao.getBalance(accountNumber);
    }

    public BankStatement getStatement(int accountNumber, Long fromDate, Long toDate) {
        return transactionDao.getStatement(accountNumber, fromDate, toDate);
    }

    public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
        return transactionDao.addBeneficiary(beneficiaryDetails);
    }
}