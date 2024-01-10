package com.spring.training.orm.hibernate;

import javax.persistence.*;

@Entity
@Table(name="manager_tbl")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ManagerTableId")
    @TableGenerator(name = "ManagerTableId", table = "id_tbl", allocationSize = 10)
    Long id;

    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
