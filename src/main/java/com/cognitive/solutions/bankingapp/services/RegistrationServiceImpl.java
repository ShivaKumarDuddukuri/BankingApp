package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.RegistrationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private static final Logger logger = LoggerFactory
            .getLogger(RegistrationServiceImpl.class);

    @Autowired
    private RegistrationManager registrationManager;


}