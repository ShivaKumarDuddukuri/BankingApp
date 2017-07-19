package com.shiva.bankingapp.models.output;

import com.shiva.bankingapp.models.core.Transaction;

import java.util.List;

/**
 * Created by shivad on 09/07/17.
 */
public class BankStatement {
    private int               accountNumber;
    private List<Transaction> transactions;

    public BankStatement(int accountNumber, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.transactions = transactions;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
