package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.AccountDao;
import com.cognitive.solutions.bankingapp.dao.UserDao;
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
    private UserDao userDao;

    @Autowired
    private AccountDao accountDao;

    public ControllerResponse register(RegistrationInfo registrationInfo) {
        logger.info("Registering Users in RegistrationManagerImpl");

        if (!userDao.createUser(registrationInfo.getCustomer())) {
            return new ControllerResponse(HttpResponseStatus.REGISTRATION_FAILED, "Registartion Failed");
        }
        if (accountDao.createAccount(registrationInfo)) {
            return new ControllerResponse(HttpResponseStatus.REGISTRATION_SUCCESSFUL, "Successfully Registered");
        }
        return new ControllerResponse(HttpResponseStatus.REGISTRATION_FAILED, "Registartion Failed");
    }
}