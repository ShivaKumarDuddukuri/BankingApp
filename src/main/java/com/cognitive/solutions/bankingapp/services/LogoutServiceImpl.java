package com.cognitive.solutions.bankingapp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Service
public class LogoutServiceImpl implements LogoutService {

    private static final Logger logger = LoggerFactory
            .getLogger(LogoutServiceImpl.class);


    public void logout(HttpServletRequest request, HttpServletResponse response) {
        logger.info("Trying to Logout in LogoutServiceImpl");
        response.setContentType("text/html");
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        try {
            response.sendRedirect("login.html");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}