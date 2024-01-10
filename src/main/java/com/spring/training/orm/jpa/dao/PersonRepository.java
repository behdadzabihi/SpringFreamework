package com.spring.training.orm.jpa.dao;

import com.spring.training.orm.jpa.entity.Person;
import com.spring.training.orm.jpa.model.SimplePerson;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByFirstName(String firstName);
    List<Person> findByFirstNameAndLastName(String firstName, String lastName);
    @Query("update Person p set p.firstName=:firstName, p.lastName=:lastName where p.nationalCode=:nationalCode")
    void updateFirstNameAndLastName(String firstName, String lastName, String nationalCode);
    Page<Person> findByFirstName(String firstName, Pageable pageable);
    List<SimplePerson> findSimpleByFirstName(String firstName);
}
