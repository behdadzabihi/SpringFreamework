package com.spring.training.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;




//@Component
public class UserController {

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public void changePassword(){
        String encodedPass = passwordEncoder.encode("mypass");
    }

    public void showDetails(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
    }
}
