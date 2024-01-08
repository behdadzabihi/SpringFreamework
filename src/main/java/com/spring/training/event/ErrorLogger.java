package com.spring.training.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ErrorLogger implements ApplicationListener<ErrorEvent> {
    public void onApplicationEvent(ErrorEvent errorEvent) {
        System.out.println("SQRT Error with input:"+errorEvent.getNumber());
    }
}
