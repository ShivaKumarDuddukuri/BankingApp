package com.shiva.bankingapp.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginService {


    void login(HttpServletRequest request, HttpServletResponse response);
}