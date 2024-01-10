package com.spring.training.orm.jpa.service;

import com.spring.training.orm.jpa.dao.PersonRepository;
import com.spring.training.orm.jpa.entity.Person;
import com.spring.training.orm.jpa.model.SimplePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepo;

    public Person save(Person person){
        return personRepo.save(person);
    }

    public List<Person> findAll(){
        return personRepo.findAll();
    }

    public Page<Person> findByFirstName(String firstName, Pageable pageable){
        return personRepo.findByFirstName(firstName, pageable);
    }
    public List<SimplePerson> findSimpleByFirstName(String firstName){
        return personRepo.findSimpleByFirstName(firstName);
    }
}
