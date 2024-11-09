package com.example4.config;

import com.example4.components.Person;
import com.example4.components.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Primary
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Primary
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Lucky");
        person.setVehicle(vehicle());   // manual wiring
        return person;
    }

    @Bean
    public Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean
    public Person person2(Vehicle vehicle2) {   // always wires to the primary bean of that class
        Person person = new Person();
        person.setName("Lola");
        person.setVehicle(vehicle2);   // wiring through method parameters
        return person;
    }
}
