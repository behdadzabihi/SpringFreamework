package com.spring.training.orm.jpa;


import com.spring.training.orm.jpa.entity.Person;
import com.spring.training.orm.jpa.model.SimplePerson;
import com.spring.training.orm.jpa.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public class SpringJpaMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        PersonService personService = context.getBean(PersonService.class);
        Person person = new Person();
        person.setFirstName("Ali");
        person.setLastName("Mahdavaian");
        personService.save(person);

        List<Person> persons = personService.findAll();
        for(Person p:persons){
            System.out.println(p);
        }
        Page<Person> page = personService.findByFirstName("Ali", PageRequest.of(3, 10));

        List<Person> pageList = page.getContent();

        List<SimplePerson> simplePersonList = personService.findSimpleByFirstName("Ali");
        System.out.println();
    }
}

