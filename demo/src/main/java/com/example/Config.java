package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class Config {
    @Bean(name={"address","add"})
    public Address getAddress()
    {
        Address address = new Address();
        address.setCity("Solapur");
        address.setStreet("Sahara Nagar");
        return address;
    }
    @Bean(name = {"student","obj"})
    public Student getStudent()
    {
        Student student = new Student();
        student.setId(101);
        student.setName("Shanks");
        
        return student;
    }
}
