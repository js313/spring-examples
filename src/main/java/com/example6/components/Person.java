package com.example6.components;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    final Vehicle vehicle;
    String name;

    @Autowired  // optional to even mention it spring automatically does it
    Person(@Qualifier("vehicle3") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    void initialize() {
        this.name = "Lucky";
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
