package com.spring.training.orm.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration=new Configuration();
            configuration.configure();
            sessionFactory=configuration.buildSessionFactory();
        }
        return sessionFactory;
    }

    public static Session openSession(){
        return getSessionFactory().openSession();
    }

}
