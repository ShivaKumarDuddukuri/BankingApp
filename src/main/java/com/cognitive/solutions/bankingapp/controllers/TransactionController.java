package com.cognitive.solutions.bankingapp.controllers;

import com.cognitive.solutions.bankingapp.constants.URIConstants;
import com.cognitive.solutions.bankingapp.models.core.BankAccount;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.input.BeneficiaryDetails;
import com.cognitive.solutions.bankingapp.services.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = URIConstants.TRANSACTION_BASE_URI)
public class TransactionController {

    private static final Logger logger = LoggerFactory
            .getLogger(TransactionController.class);

    @Autowired
    private TransactionService transactionService;


    @RequestMapping(value = URIConstants.TRANSFER, method = RequestMethod.POST,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse transfer(@RequestBody BankAccount bankAccount) {
        logger.info("Starting Crediting in Controller layer");
        return transactionService.transfer(bankAccount);
    }


    @RequestMapping(value = URIConstants.BALANCE, method = RequestMethod.GET,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse getBalance(@RequestParam(value = "accountNumber") int accountNumber) {
        logger.info("Starting Crediting in Controller layer");
        return transactionService.getBalance(accountNumber);
    }


    @RequestMapping(value = URIConstants.STATEMENT, method = RequestMethod.GET,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse getStatement(@RequestParam(value = "accountNumber") int accountNumber,
                                    @RequestParam(value = "fromDate") Long fromDate,
                                    @RequestParam(value = "toDate") Long toDate) {
        logger.info("Starting Crediting in Controller layer");
        return transactionService.getStatement(accountNumber, fromDate, toDate);
    }


    @RequestMapping(value = URIConstants.ADD_BENEFICIARY, method = RequestMethod.POST,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse addBeneficiary(@RequestBody BeneficiaryDetails beneficiaryDetails) {
        logger.info("Starting Crediting in Controller layer");
        return transactionService.addBeneficiary(beneficiaryDetails);
    }
}

