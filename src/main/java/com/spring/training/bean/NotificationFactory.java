package com.spring.training.bean;

public class NotificationFactory {

    //factory-bean in xml context
    public  Notifier getNotifier(){
        return new EmailNotification();
    }

    //for factory-method in xml context
//    public static Notifier getNotifier(){
//        return new EmailNotification();
//    }
}
