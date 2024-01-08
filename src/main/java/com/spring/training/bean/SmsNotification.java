package com.spring.training.bean;

public class SmsNotification implements Notifier{
    @Override
    public void notify(String message) {
        System.out.println("SMS is sending:"+message);
    }
}
