package com.spring.training.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Calculator implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    public double sqrt(int number){
        if(number<0){
            ErrorEvent error = new ErrorEvent(this, number);
            applicationEventPublisher.publishEvent(error);
            //another logic
        }
        return Math.sqrt(number);
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
       this.applicationEventPublisher=applicationEventPublisher;
    }
}
