package com.spring.training.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class MessagePerformer {

    public void execute(){
        System.out.println("Executing Task!");
    }

    public void executeWithParam(String name, int number){
        System.out.println(name+" Performer is running normally.");
    }

    public String manipulate(String input){
        StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        return buffer.reverse().toString();
    }

    public void methodWithException(){
        throw new RuntimeException("This is a self-created exceptioin");
    }
}
