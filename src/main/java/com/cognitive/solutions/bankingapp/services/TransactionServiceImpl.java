package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.TransactionManager;
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


}