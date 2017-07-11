package com.cognitive.solutions.bankingapp.dao;

import com.cognitive.solutions.bankingapp.models.core.Customer;

public interface UserDao {


    boolean createUser(Customer customer);
}