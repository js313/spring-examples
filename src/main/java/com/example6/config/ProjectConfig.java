package com.example6.config;

import com.example6.components.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example6.components")
public class ProjectConfig {
    @Bean(name = "vehicle1")
    Vehicle vehicle1() {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("vehicle1");
        return vehicle1;
    }

    @Primary
    @Bean(name = "vehicle2")
    Vehicle vehicle2() {
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setName("vehicle2");
        return vehicle2;
    }

    @Bean(name = "vehicle3")
    Vehicle vehicle3() {
        Vehicle vehicle3 = new Vehicle();
        vehicle3.setName("vehicle3");
        return vehicle3;
    }
}
