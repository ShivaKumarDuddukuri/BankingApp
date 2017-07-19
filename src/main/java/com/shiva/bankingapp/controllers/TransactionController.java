package com.shiva.bankingapp.controllers;

import com.shiva.bankingapp.constants.URIConstants;
import com.shiva.bankingapp.models.core.Transaction;
import com.shiva.bankingapp.models.http.ControllerResponse;
import com.shiva.bankingapp.models.input.BeneficiaryDetails;
import com.shiva.bankingapp.services.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = URIConstants.TRANSACTION_BASE_URI)
public class TransactionController {

    private static final Logger logger = LoggerFactory.getLogger(TransactionController.class);

    @Autowired private TransactionService transactionService;

    @RequestMapping(value = URIConstants.TRANSFER, method = RequestMethod.POST,
            produces = { "application/json" }, consumes = { "application/json" }) public @ResponseBody ControllerResponse transfer(
            @RequestBody Transaction transaction) {
        logger.info("Starting Transfer in Controller layer");
        return transactionService.transfer(transaction);
    }

    @RequestMapping(value = URIConstants.BALANCE, method = RequestMethod.GET,
            produces = { "application/json" }, consumes = { "application/json" }) public @ResponseBody ControllerResponse getBalance(
            @RequestParam(value = "accountNumber") int accountNumber) {
        logger.info("Starting GetBalance in Controller layer");
        return transactionService.getBalance(accountNumber);
    }

    @RequestMapping(value = URIConstants.STATEMENT, method = RequestMethod.GET,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse getStatement(@RequestParam(value = "accountNumber") int accountNumber,
                                    @RequestParam(value = "fromDate") Long fromDate,
                                    @RequestParam(value = "toDate") Long toDate) {
        logger.info("Starting Get Statement in Controller layer");
        return transactionService.getStatement(accountNumber, fromDate, toDate);
    }


    @RequestMapping(value = URIConstants.ADD_BENEFICIARY, method = RequestMethod.POST,
            produces = {"application/json"}, consumes = {"application/json"})
    public
    @ResponseBody
    ControllerResponse addBeneficiary(@RequestBody BeneficiaryDetails beneficiaryDetails) {
        logger.info("Starting Adding Beneficiary in Controller layer");
        return transactionService.addBeneficiary(beneficiaryDetails);
    }
}

