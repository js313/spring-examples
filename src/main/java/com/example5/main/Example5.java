package com.example5.main;

import com.example5.components.Person;
import com.example5.components.Vehicle;
import com.example5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        person.getVehicle().setName("Honda");   // same bean wired to the person

        System.out.println("Person name: " + person.getName());
        System.out.println("Vehicle name: " + vehicle.getName());
        System.out.println("Vehicle owned by person name: " + person.getVehicle().getName());
    }
}
