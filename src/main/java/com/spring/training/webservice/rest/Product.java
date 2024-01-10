package com.spring.training.webservice.rest;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 4/16/21
 * Time: 10:38 AM
 */

public class Product {
    Long id;
    String name;
    String producer;
    String type;

    public Product() {
    }

    public Product(Long id, String name, String producer, String type) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.type = type;
    }

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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
