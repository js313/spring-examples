package com.example6.main;

import com.example6.components.Person;
import com.example6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person name: " + person.getName());
        System.out.println("Vehicle owned by person name: " + person.getVehicle().getName());
    }
}
