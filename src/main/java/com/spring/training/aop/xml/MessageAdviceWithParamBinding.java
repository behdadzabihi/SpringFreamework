package com.spring.training.aop.xml;

import java.util.Formatter;

public class MessageAdviceWithParamBinding {

    public void log(String name,int number){
        System.out.println(new Formatter().format("Target is calling with name %s,name %d number",name,number));
    }
}
