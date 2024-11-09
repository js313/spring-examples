package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Test");
        System.out.println("vehicle1 name POJO: " + vehicle1.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("lolly");
        Vehicle vehicle2 = context.getBean("vehicle", Vehicle.class);
        System.out.println("vehicle2 name Bean: " + vehicle2.getName());

        System.out.println("slowly");
        Vehicle vehicle3 = context.getBean("vehicle3.5", Vehicle.class);
        System.out.println("vehicle3 name Bean: " + vehicle3.getName());

        System.out.println("default");
        Vehicle vehicle4 = context.getBean(Vehicle.class);
        System.out.println("vehicle3 name Bean: " + vehicle4.getName());
    }
}
