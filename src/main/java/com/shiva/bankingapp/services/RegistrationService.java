package com.shiva.bankingapp.services;

import com.shiva.bankingapp.models.http.ControllerResponse;
import com.shiva.bankingapp.models.input.RegistrationInfo;

public interface RegistrationService {


    ControllerResponse register(RegistrationInfo registrationInfo);
}