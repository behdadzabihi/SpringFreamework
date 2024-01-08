package com.spring.training.bean;


public class NotificationService {

//    @Autowired
//    @Qualifier("advance")
    Notifier notifier;

    String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //    @PostConstruct this is annotation and in xml config with another way
    public void init(){
        System.out.println("Notification Service is ready!");
    }

//    @PreDestroy this is annotation and in xml config with another way
    public void destroy(){
        System.out.println("NotificationService is being destroyed");
    }


//    constructor injection
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }
    public void notify(String message){
        String styled="[Subject:"+subject+"] [content:"+message+"]";
        notifier.notify(styled);
    }



//    //setter injection
//    public void setNotifier(Notifier notifier) {
//        this.notifier = notifier;
//    }

//    method injection
//    public abstract Notifier getNotifier();

}
