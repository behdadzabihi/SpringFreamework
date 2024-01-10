package com.spring.training.orm.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="person_tbl")
public class Person implements Serializable {

    @Id
    @GeneratedValue
    Long id;

    @Column(name="first_name")
    String firstName;

    @Column(name="last_name")
    String lastName;

    @Column(name="national_code")
    String nationalCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
