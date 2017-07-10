package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;

public interface RegistrationManager {


    ControllerResponse register(RegistrationInfo registrationInfo);
}