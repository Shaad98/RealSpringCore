package com.example;

import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Configure {
   @Bean(name={"student","obj","st","shaad"})
   public Student getStudent()
   {
        Student student = new Student();
        student.setId(12);
        student.setCity("Solapur");
        student.setName("Shaad");
        return student;
   }
}
