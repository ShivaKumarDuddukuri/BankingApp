package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.core.Customer;
import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;

public interface UserDao {


    boolean createUser(Customer customer);
}