package com.cognitive.solutions.bankingapp.models.http;

public enum HttpResponseStatus {

    SUCCESS("Success"), FAILURE("Failure"), MISSING_PARAMETER("MissingParamter"), INVALID_REQUEST(
            "InvalidRequest"), NOT_FOUND("NotFound"), INVALID_ACCOUNT_NUMBER("Invalid Account Number"),
    INVALID_CREDIT_AMOUNT("Invalid Credit Amount"), INVALID_DEBIT_AMOUNT("Invalid Debit Amount"),
    DEBIT_FAILED("Debit Failed"), CREDIT_FAILED("Credit Failed"), DEBIT_SUCCESS("Debit Successfully"),
    CREDIT_SUCCESS("Credited Successfully"),
    REGISTRATION_INFO_INVALID("Invalid Registration Information"),
    REGISTRATION_SUCCESSFUL(" Registration Successfull"),
    REGISTRATION_FAILED(" Registration failed");

    private HttpResponseStatus(String value) {

    }
}
