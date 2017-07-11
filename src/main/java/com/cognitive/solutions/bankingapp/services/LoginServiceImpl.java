package com.cognitive.solutions.bankingapp.services;

import com.cognitive.solutions.bankingapp.manager.LoginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginServiceImpl.class);

    @Autowired
    private LoginManager loginManager;

    public void login(HttpServletRequest request, HttpServletResponse response) {
        logger.info("Trying to Login in LoginServiceImpl");
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        if (loginManager.login(user, pwd)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(15 * 60);
            Cookie userName = new Cookie("user", user);
            response.addCookie(userName);
            String encodedURL = response.encodeRedirectURL("LoginSuccess.jsp");
//            try {
//                response.sendRedirect(encodedURL);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        } else {
//            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
//            PrintWriter out = null;
//            try {
//                out = response.getWriter();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            out.println("<font color=red>Either user name or password is wrong.</font>");
//            try {
//                rd.include(request, response);
//            } catch (ServletException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}