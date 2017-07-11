package com.cognitive.solutions.bankingapp.models.http;

public enum HttpResponseStatus {

    SUCCESS("Success"), FAILURE("Failure"),
    REGISTRATION_INFO_INVALID("Invalid Registration Information"),
    REGISTRATION_SUCCESSFUL(" Registration Successfull"),
    REGISTRATION_FAILED(" Registration failed"),
    LOGIN_SUCCESSFUL(" Login Successfull"),
    LOGIN_FAILED(" Login failed"),
    INVALID_ACCOUNT_NUMBER("Invalid Account Number"),
    INVALID_BENEFICIARY("Invalid Beneficiary"),
    INVALID_DATE("Invalid Date"),
    INVALID_BANK_ACCOUNT("Invalid Bank Account"),
    INVALID_PAYEE_LIST("Invalid Payee List");
    private HttpResponseStatus(String value) {

    }
}
