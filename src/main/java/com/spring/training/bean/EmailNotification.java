package com.spring.training.bean;

public class EmailNotification implements Notifier{
    @Override
    public void notify(String message) {
        System.out.println("Email is sending: "+message);
    }
}
