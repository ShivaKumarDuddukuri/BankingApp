package com.shiva.bankingapp.dao;

import com.shiva.bankingapp.models.input.RegistrationInfo;

public interface AccountDao {


    boolean createAccount(RegistrationInfo registrationInfo);
}