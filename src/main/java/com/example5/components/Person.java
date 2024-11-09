package com.example5.components;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    // Disadvantages of Autowiring using type 1 and 2 is you cannot set the field as 'final'
    //    @Autowired(required = false)    // Type 1: annotation on a field
    final Vehicle vehicle;
    String name;

//    public Person() {
//        System.out.println("Person object created");
//    }

    @Autowired  // optional to even mention it spring automatically does it
    // Type 3: annotation on constructor. Best method industry approved
    Person(Vehicle vehicle) {
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

//    @Autowired  // Type 2: annotation on setter method
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}
