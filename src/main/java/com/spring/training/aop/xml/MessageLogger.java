package com.spring.training.aop.xml;

import org.aspectj.lang.JoinPoint;

public class MessageLogger {

    public void log(JoinPoint joinPoint){
        System.out.println("## Aspect is running");
        System.out.println("target class:"+joinPoint.getTarget().getClass());
        System.out.println("target proxy: "+joinPoint.getThis().getClass());
        System.out.println("target args: "+joinPoint.getArgs());
        System.out.println("#####################");
    }
}
