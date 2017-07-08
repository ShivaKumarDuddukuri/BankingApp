package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.LoginDao;
import com.cognitive.solutions.bankingapp.dao.TransactionDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginManagerImpl implements LoginManager {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginManagerImpl.class);

    @Autowired
    private LoginDao loginDao;


}