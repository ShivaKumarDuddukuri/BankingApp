package com.shiva.bankingapp.dao;

import com.shiva.bankingapp.models.core.Customer;

public interface UserDao {


    boolean createUser(Customer customer);

    boolean validateUser(String userName, String password);
}