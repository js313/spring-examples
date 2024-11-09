package com.example4.components;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle object created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHell() {
        System.out.println("Hell Car");
    }
}
