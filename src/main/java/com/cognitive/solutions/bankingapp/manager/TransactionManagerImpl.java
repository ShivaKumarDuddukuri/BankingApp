package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.TransactionDao;
import com.cognitive.solutions.bankingapp.models.core.CreditInfo;
import com.cognitive.solutions.bankingapp.models.core.DebitInfo;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.http.HttpResponseStatus;
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


}