package com.spring.training.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-Event.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.sqrt(-12);
    }
}
