package com.spring.training.security.dao;


import com.spring.training.security.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;


@Repository
public class UserDao {

    @Autowired
    SessionFactory sessionFactory;

    public User findByUsername(String username){
        Query query = (Query) sessionFactory.openSession().createNamedQuery("findByUsername");
        query.setParameter("username", username);
        return (User) query.getSingleResult();
    }
}
