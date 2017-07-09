package com.cognitive.solutions.bankingapp.controllers;

import com.cognitive.solutions.bankingapp.constants.URIConstants;
import com.cognitive.solutions.bankingapp.services.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = URIConstants.LOGIN_BASE_URI)
public class LoginController {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.POST,
            produces = {"application/json"})
    public
    @ResponseBody
    void login(HttpServletRequest request,
               HttpServletResponse response) {
        loginService.login(request, response);
    }

}
