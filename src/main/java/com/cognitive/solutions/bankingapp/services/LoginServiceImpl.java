package com.cognitive.solutions.bankingapp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginServiceImpl.class);


    public void login(HttpServletRequest request, HttpServletResponse response) {
        logger.info("Trying to Login in LoginServiceImpl");
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        session.setMaxInactiveInterval(15 * 60);
        Cookie userName = new Cookie("user", user);
        response.addCookie(userName);
        String encodedURL = response.encodeRedirectURL("LoginSuccess.jsp");
    }
}