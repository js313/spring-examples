package com.example8.main;

import com.example8.components.Vehicle;
import com.example8.config.ProjectConfig;
import com.example8.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.setVehicleStarted(true);

        VehicleService vehicleService = vehicle.getVehicleService();
        vehicleService.playMusic("Swalla", false);
        vehicleService.moveVehicle(true);
        vehicleService.stopVehicle(true);
    }
}
