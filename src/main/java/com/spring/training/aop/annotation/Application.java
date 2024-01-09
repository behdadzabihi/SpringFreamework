package com.spring.training.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-AOP.xml");
        MessagePerformer performer=context.getBean(MessagePerformer.class);
        performer.execute();

        //with params
//        performer.executeWithParam("Simple Performer", 1);

        //with returning
//        performer.manipulate("Hello Spring Boot!");

        //with exception
//        performer.methodWithException();
    }
}
