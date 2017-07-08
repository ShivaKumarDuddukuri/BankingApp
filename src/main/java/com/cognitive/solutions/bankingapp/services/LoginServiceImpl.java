package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.LoginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginServiceImpl.class);

    @Autowired
    private LoginManager loginManager;


}