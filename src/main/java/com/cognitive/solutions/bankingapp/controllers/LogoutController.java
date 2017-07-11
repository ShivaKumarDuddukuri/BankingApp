package com.cognitive.solutions.bankingapp.controllers;

import com.cognitive.solutions.bankingapp.constants.URIConstants;
import com.cognitive.solutions.bankingapp.services.LogoutService;
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
@RequestMapping(value = URIConstants.LOGOUT_BASE_URI)
public class LogoutController {

    private static final Logger logger = LoggerFactory
            .getLogger(LogoutController.class);

    @Autowired
    private LogoutService logoutService;

    @RequestMapping(method = RequestMethod.POST,
            produces = {"application/json"})
    public
    @ResponseBody
    void logout(HttpServletRequest request,
                HttpServletResponse response) {
        logger.info("Trying to Logout in LogoutController");
        logoutService.logout(request, response);
    }

}
