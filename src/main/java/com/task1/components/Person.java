package com.task1.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("PersonBean")
public class Person {
    String name;
    final Vehicle vehicle;

    @Autowired
    Person(Vehicle vehicle) {
        System.out.println("Person Created");
        this.name = "Johnny";
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
