package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JsonIgnoreProperties("person")
    private List<Payment> payments;


    public Person() {
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public List<Payment> getPayments() {
        return this.payments;
    }


    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
