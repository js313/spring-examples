package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        System.out.println("poly");
        Vehicle veh = new Vehicle();
        veh.setName("Test Car");
        return veh;
    }

    @Bean
    Vehicle vehicle1() {
        System.out.println("poly1");
        Vehicle veh = new Vehicle();
        veh.setName("Test Car1");
        return veh;
    }

    @Bean(name = "vehicle3")
    Vehicle vehicle2() {
        System.out.println("poly2");
        Vehicle veh = new Vehicle();
        veh.setName("Test Car2");
        return veh;
    }

    @Bean("vehicle3.5")
    Vehicle vehicle35() {
        System.out.println("poly3.5");
        Vehicle veh = new Vehicle();
        veh.setName("Test Car3.5");
        return veh;
    }

    @Primary
    @Bean(value = "vehicle4")
    Vehicle vehicle3() {
        System.out.println("poly3");
        Vehicle veh = new Vehicle();
        veh.setName("Test Car3");
        return veh;
    }
}
