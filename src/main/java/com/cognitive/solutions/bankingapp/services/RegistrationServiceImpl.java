package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.RegistrationManager;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;
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


    public ControllerResponse register(RegistrationInfo registrationInfo) {
        boolean isRegistered = registrationManager.register(registrationInfo);
        return null;
    }
}