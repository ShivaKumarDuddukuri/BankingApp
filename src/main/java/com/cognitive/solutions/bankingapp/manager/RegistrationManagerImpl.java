package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.RegistrationDao;
import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;
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


    public boolean register(RegistrationInfo registrationInfo) {
        return registrationDao.register(registrationInfo);
    }
}