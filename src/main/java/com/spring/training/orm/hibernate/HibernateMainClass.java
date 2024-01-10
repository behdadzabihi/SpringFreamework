package com.spring.training.orm.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateMainClass {

    public static void main(String[] args) {
       Session session= HibernateUtil.openSession();
       session.close();
        Message message = new Message();
        message.setMsg("Hello again Hibernate!");

        //
//        message.setMsg("Hello Hibernate!");
//        save(message);
//        message = load();
        message.setMsg("Hello again Hibernate!");
        update(message);
        refresh(message);
        remove(message);
    }

    private static Message load(){
        Session session = HibernateUtil.openSession();

        //database operations!
        Transaction transaction = session.beginTransaction();
        Message message = session.get(Message.class, 1);
        System.out.println(message);
        transaction.commit();

        session.close();
        return message;
    }

    public static void update(Message message){

        Session session = HibernateUtil.openSession();

        //database operations!
        Transaction transaction = session.beginTransaction();
        session.update(message);
        transaction.commit();

        session.close();

    }

    public static void remove(Message message){

        Session session = HibernateUtil.openSession();

        //database operations!
        Transaction transaction = session.beginTransaction();
        session.delete(message);
        transaction.commit();

        session.close();

    }
    public static void refresh(Message message){

        Session session = HibernateUtil.openSession();

        //database operations!
        Transaction transaction = session.beginTransaction();
        session.refresh(message);
        System.out.println(message);
        transaction.commit();

        session.close();

    }

    private static void save(Object obj){
        Session session = HibernateUtil.openSession();

        //database operations!
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();

        session.close();
    }
}
