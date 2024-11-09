package com.example4.components;

public class Person {
    String name;
    Vehicle vehicle;

    public Person() {
        System.out.println("Person object created");
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
