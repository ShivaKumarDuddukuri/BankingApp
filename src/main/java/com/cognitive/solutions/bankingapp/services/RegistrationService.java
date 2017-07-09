package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;

public interface RegistrationService {


    ControllerResponse register(RegistrationInfo registrationInfo);
}