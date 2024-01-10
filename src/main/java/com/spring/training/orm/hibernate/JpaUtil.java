package com.spring.training.orm.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static EntityManagerFactory entityManagerFactory;


    private static EntityManagerFactory getEntityManagerFactory(){

        if(entityManagerFactory==null){
           entityManagerFactory =
                    Persistence.createEntityManagerFactory("orm_sample");
        }
        return entityManagerFactory;
    }

    public static EntityManager createEntityManager(){
        return getEntityManagerFactory().createEntityManager();
    }
}
