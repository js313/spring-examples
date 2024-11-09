package com.example5.components;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    @PostConstruct
    void initialize() {
        this.name = "Toyota";
    }

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
