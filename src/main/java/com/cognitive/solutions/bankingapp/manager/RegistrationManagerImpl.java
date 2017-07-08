package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.RegistrationDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationManagerImpl implements RegistrationManager {

    private static final Logger logger = LoggerFactory
            .getLogger(RegistrationManagerImpl.class);

    @Autowired
    private RegistrationDao registrationDao;


}