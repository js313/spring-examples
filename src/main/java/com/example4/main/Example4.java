package com.example4.main;

import com.example4.components.Person;
import com.example4.components.Vehicle;
import com.example4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Person name: " + person.getName());
        System.out.println("Vehicle name: " + vehicle.getName());
        System.out.println("Vehicle owned by person: " + person.getVehicle().getName());

        Person person2 = context.getBean("person2", Person.class);
        Vehicle vehicle2 = context.getBean("vehicle2", Vehicle.class);

        System.out.println("Person 2 name: " + person2.getName());
        System.out.println("Vehicle 2 name: " + vehicle2.getName());
        System.out.println("Vehicle owned by person 2: " + person2.getVehicle().getName());
    }
}
