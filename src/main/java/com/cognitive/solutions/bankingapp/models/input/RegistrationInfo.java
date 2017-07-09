package com.cognitive.solutions.bankingapp.models.input;

import com.cognitive.solutions.bankingapp.models.core.CurrencyType;
import com.cognitive.solutions.bankingapp.models.core.Customer;

/**
 * Created by shivad on 09/07/17.
 */
public class RegistrationInfo {
    private int userId;
    private double balance;
    private CurrencyType currencyType;
    private Customer customer;

    public RegistrationInfo(int userId, double balance, CurrencyType currencyType, Customer customer) {
        this.userId = userId;
        this.balance = balance;
        this.currencyType = currencyType;
        this.customer = customer;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
