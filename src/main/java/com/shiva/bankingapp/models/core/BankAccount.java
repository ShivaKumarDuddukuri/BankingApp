package com.shiva.bankingapp.models.core;

import java.util.List;

public class BankAccount {

    private Customer owner;
    private int accountNumber;
    private AccountType accountType;
    private List<Transaction> transactionList;
    private List<Customer> beneficiary;

    public List<Customer> getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(List<Customer> beneficiary) {
        this.beneficiary = beneficiary;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}