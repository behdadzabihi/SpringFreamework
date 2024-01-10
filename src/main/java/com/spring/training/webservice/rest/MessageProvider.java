package com.spring.training.webservice.rest;

import org.springframework.stereotype.Component;

import java.util.ResourceBundle;


@Component
public class MessageProvider {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    public String getValue(String key){
        return resourceBundle.getString(key);
    }
}
