package com.shiva.bankingapp.models.output;

import com.shiva.bankingapp.models.core.CurrencyType;

/**
 * Created by shivad on 09/07/17.
 */
public class BalanceInformation {
    private int          amount;
    private CurrencyType currencyType;
    private int          accountNumber;

    public BalanceInformation(int amount, CurrencyType currencyType, int accountNumber) {
        this.amount = amount;
        this.currencyType = currencyType;
        this.accountNumber = accountNumber;
    }

    public BalanceInformation() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
