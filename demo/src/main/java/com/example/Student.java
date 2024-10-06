package com.example;

public class Student {

    private int id;
    private String name;
    private Address address;

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
        System.out.println("setting Name");
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting Address");
        this.address = address;
    }

    public Student(int id, String name, Address address) {
        System.out.println("Student Constructor called with fields id , name , address");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

}
