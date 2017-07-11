package com.cognitive.solutions.bankingapp.manager;

import com.cognitive.solutions.bankingapp.dao.UserDao;
import com.cognitive.solutions.bankingapp.models.http.ControllerResponse;
import com.cognitive.solutions.bankingapp.models.http.HttpResponseStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginManagerImpl implements LoginManager {

    private static final Logger logger = LoggerFactory
            .getLogger(LoginManagerImpl.class);

    @Autowired
    private UserDao userDao;

    public boolean login(String userName, String password) {
       return userDao.validateUser(userName, password) ;
    }
}