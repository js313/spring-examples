package com.example8.components;

import com.example8.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    boolean vehicleStarted;
    final VehicleService vehicleService;

    @Autowired
    Vehicle(@Qualifier("VehicleService") VehicleService vs) {
        System.out.println("Vehicle created");
        this.vehicleService = vs;
        vehicleStarted = false;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public boolean isVehicleStarted() {
        return vehicleStarted;
    }

    public void setVehicleStarted(boolean vehicleStarted) {
        this.vehicleStarted = vehicleStarted;
    }
}
