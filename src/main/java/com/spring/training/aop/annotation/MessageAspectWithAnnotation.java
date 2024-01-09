package com.spring.training.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MessageAspectWithAnnotation {

    @After("execution(* com.spring.training.aop.annotation.MessagePerformer.*(..))")
    public void doSomething() {
        System.out.println("A Simple Aspect to run");
    }

    @Before("execution(* com.spring.training.aop.annotation.MessagePerformer.*(..)) && args(name, number)")
    public void doSomething(String name, int number){
        System.out.println("A Simple Aspect to run with "+name+" number "+number);
    }

    @AfterReturning(value="execution(* com.spring.training.aop.annotation.MessagePerformer.manipulate(..)) ", returning="retValue")
    public void doSomething(Object retValue){
        System.out.println("Result of method is:"+retValue);
    }

    @AfterThrowing(value="execution(* com.spring.training.aop.annotation.MessagePerformer.methodWithException(..)) ", throwing = "ex")
    public void doSomethingWithExceptionCatch(Exception ex){
        System.out.println("Exception occured:"+ex.getMessage());
    }

}
