package com.spring.training.webservice.rest;

import org.springframework.stereotype.Component;

import java.util.ResourceBundle;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 4/16/21
 * Time: 11:32 AM
 */
@Component
public class MessageProvider {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    public String getValue(String key){
        return resourceBundle.getString(key);
    }
}
