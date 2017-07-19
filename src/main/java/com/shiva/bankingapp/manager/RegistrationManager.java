package com.shiva.bankingapp.manager;

import com.shiva.bankingapp.models.http.ControllerResponse;
import com.shiva.bankingapp.models.input.RegistrationInfo;

public interface RegistrationManager {


    ControllerResponse register(RegistrationInfo registrationInfo);
}