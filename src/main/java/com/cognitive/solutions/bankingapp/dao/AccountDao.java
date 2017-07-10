package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;

public interface AccountDao {


    boolean createAccount(RegistrationInfo registrationInfo);
}