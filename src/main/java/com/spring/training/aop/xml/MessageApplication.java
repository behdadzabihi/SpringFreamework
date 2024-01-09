package com.spring.training.aop.xml;

import com.spring.training.aop.annotation.MessagePerformer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageApplication {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-AOP.xml");
//        Performer performer=context.getBean(Performer.class);
//        //for test after,around,before
//        performer.perform("First",1);
        //for test exception
//        performer.performWithException();
        MessagePerformer performerM=context.getBean(MessagePerformer.class);
        performerM.execute();
    }
}
