package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.RegistrationManager;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.http.HttpResponseStatus;
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
        if (registrationInfo == null) {
            new ControllerResponse(HttpResponseStatus.REGISTRATION_INFO_INVALID, "Registartion Information cant be null");
        }
        if (registrationInfo.getAccountType() == null) {
            new ControllerResponse(HttpResponseStatus.REGISTRATION_INFO_INVALID, "Registartion Account Type Cant be null");
        }
        if (registrationInfo.getCustomer().getDate_of_birth() == null) {
            new ControllerResponse(HttpResponseStatus.REGISTRATION_INFO_INVALID, "Registartion DOB cant be null");
        }
        if (registrationInfo.getCustomer().getPhone() == null) {
            new ControllerResponse(HttpResponseStatus.REGISTRATION_INFO_INVALID, "Registartion Phone cant be null");
        }
        return registrationManager.register(registrationInfo);
    }
}