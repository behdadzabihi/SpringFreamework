package com.spring.training.aop.xml;

public class Performer {

    public void perform(String name,int number){
        System.out.println("Performer is running with normally");
    }

    public void performWithException(){
        System.out.println("Perform is running with exception");
        throw new RuntimeException();
    }
}
