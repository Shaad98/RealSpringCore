package com.example;

public class Student {
    private int id;
    private String name;
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
