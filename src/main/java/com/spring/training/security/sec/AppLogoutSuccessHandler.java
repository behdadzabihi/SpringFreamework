package com.spring.training.security.sec;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import javax.servlet.ServletException;

import java.io.IOException;
import java.util.logging.Logger;



public class AppLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

    static Logger logger = Logger.getLogger(AppLogoutSuccessHandler.class.getName());
    @Override
    public void onLogoutSuccess(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Authentication authentication) throws IOException, jakarta.servlet.ServletException {
        super.onLogoutSuccess(request, response, authentication);
        logger.info("Loging out user: "+((User)authentication.getPrincipal()).getUsername());
    }
}
