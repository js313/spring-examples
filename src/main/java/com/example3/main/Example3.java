package com.example3.main;

import com.example3.components.Vehicle;
import com.example3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Example3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Audi");
        Supplier<Vehicle> vehicleSupplier1 = () -> vehicle1;

        Supplier<Vehicle> vehicleSupplier2 = () -> {
            Vehicle vehicle2 = new Vehicle();
            vehicle2.setName("Honda");
            return vehicle2;
        };

        context.registerBean("audiBean", Vehicle.class, vehicleSupplier1);
        context.registerBean("hondaBean", Vehicle.class, vehicleSupplier2);

        Vehicle audiVehicle = context.getBean("audiBean", Vehicle.class);
        Vehicle hondaVehicle = context.getBean("hondaBean", Vehicle.class);

        System.out.println(audiVehicle.getName());
        System.out.println(hondaVehicle.getName());
    }
}