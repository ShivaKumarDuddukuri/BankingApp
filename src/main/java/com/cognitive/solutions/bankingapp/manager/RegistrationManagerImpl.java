package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.RegistrationDao;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.http.HttpResponseStatus;
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


    public ControllerResponse register(RegistrationInfo registrationInfo) {
        boolean isRegistered = registrationDao.register(registrationInfo);
        if (isRegistered) {
            return new ControllerResponse(HttpResponseStatus.REGISTRATION_SUCCESSFUL, "Successfully Registered");
        }
        return new ControllerResponse(HttpResponseStatus.REGISTRATION_INFO_INVALID, "Registartion Failed");
    }
}