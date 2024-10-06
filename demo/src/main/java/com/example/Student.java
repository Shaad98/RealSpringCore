package com.example;

import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;


public class Student {
    // @Value("12")
    private int id;
    // @Value("Shaad")
    private String name;
    // @Value("#{new java.lang.String('Solapur')}")
    private String city;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        System.out.println("Setting Id");
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("Setting Name");
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        System.out.println("Setting City");
        this.city = city;
    }
    public Student(int id, String name, String city) {
        System.out.println("Constructor is called for Setting Id , Name , City");
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student [id=" + this.id + ", name=" + this.name + ", city=" + this.city + "]";
    }
    
}
