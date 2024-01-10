package com.spring.training.security.service;


import com.spring.training.security.dao.UserDao;
import com.spring.training.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {
    @Autowired
    UserDao userDao;

    public User findByUsername(String username){
        return userDao.findByUsername(username);
    }
}
