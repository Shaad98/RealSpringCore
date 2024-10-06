package com.example;

import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
        // ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student);
    }
}
