package com.example7.main;

import com.example7.components.Vehicle;
import com.example7.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        Vehicle vehicle2 = context.getBean(Vehicle.class);
        System.out.println("vehicle1 hashCode: " + vehicle1.hashCode());
        System.out.println("vehicle2 hashCode: " + vehicle2.hashCode());
        vehicle1.printHell();

        context.close();    // to invoke the pre-destroy annotated function
    }
}