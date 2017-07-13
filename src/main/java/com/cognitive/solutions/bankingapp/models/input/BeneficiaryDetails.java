package com.cognitive.solutions.bankingapp.models.input;

/**
 * Created by shivad on 09/07/17.
 */
public class BeneficiaryDetails {
    private int accountId;
    private int beneficiaryId;

    public BeneficiaryDetails() {
    }

    public BeneficiaryDetails(int accountId, int beneficiaryId) {
        this.accountId = accountId;
        this.beneficiaryId = beneficiaryId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(int beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }
}
