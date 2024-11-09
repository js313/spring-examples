package com.task1.components;

import com.task1.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    String name;
    VehicleService vehicleService;

    @Autowired
    Vehicle(VehicleService vehicleService) {
        System.out.println("Vehicle Created");
        this.name = "BMW";
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveAndPlay() {
        vehicleService.getSpeaker().play();
        vehicleService.getTyre().rotate();
    }
}
