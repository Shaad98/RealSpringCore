package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = (Student)context.getBean("student");
        System.out.println(student);

    }
}
