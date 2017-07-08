package com.cognitive.solutions.bankingapp.controllers;

import com.cognitive.solutions.bankingapp.constants.URIConstants;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.services.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = URIConstants.REGISTRATION_BASE_URI)
public class LoginController {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = URIConstants.CREDIT, method = RequestMethod.POST,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse credit() {
        logger.info("Starting Debiting in Controller layer");
        return null;
    }

    @RequestMapping(value = URIConstants.DEBIT, method = RequestMethod.POST,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse debit() {
        logger.info("Starting Crediting in Controller layer");
        return null;
    }

}
