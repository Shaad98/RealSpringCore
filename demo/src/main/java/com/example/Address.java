package com.example;



public class Address {
    
    private String street;
    
    private String city;
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        System.out.println("Setting Street");
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        System.out.println("Setting City");
        this.city = city;
    }
    public Address(String street, String city) {
        System.out.println("Address constructor called with parameters street , city");
        this.street = street;
        this.city = city;
    }
    public Address() {
    }
    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + "]";
    }
    
}
