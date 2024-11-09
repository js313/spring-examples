package com.example2.main;

import com.example2.components.Vehicle;
import com.example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("vehicle component bean: " + vehicle.getName());
        vehicle.printHell();

        context.close();    // to invoke the pre-destroy annotated function
    }
}