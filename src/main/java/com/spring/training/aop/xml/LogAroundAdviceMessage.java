package com.spring.training.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAroundAdviceMessage {

    public void logAroundAdvice(ProceedingJoinPoint call) throws Throwable {

        System.out.println("This is doing before invocation");
        call.proceed();
        System.out.println("This is doing after invocation");
    }
}
