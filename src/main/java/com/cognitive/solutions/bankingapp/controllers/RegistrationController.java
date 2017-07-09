package com.cognitive.solutions.bankingapp.controllers;

import com.cognitive.solutions.bankingapp.constants.URIConstants;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.RegistrationInfo;
import com.cognitive.solutions.bankingapp.services.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = URIConstants.REGISTRATION_BASE_URI)
public class RegistrationController {

    private static final Logger logger = LoggerFactory
            .getLogger(RegistrationController.class);

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.POST,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse register(@RequestBody RegistrationInfo registrationInfo) {
        logger.info("");
        return registrationService.register(registrationInfo);
    }
}
