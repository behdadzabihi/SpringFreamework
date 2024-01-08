package com.spring.training;

import com.spring.training.bean.NotificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        NotificationService service=context.getBean(NotificationService.class);
        service.notify("Hello ");
    }
}
