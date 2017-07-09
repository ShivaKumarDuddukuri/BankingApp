package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;

public interface RegistrationManager {


    boolean register(RegistrationInfo registrationInfo);
}