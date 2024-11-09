package com.example2.components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHell() {
        System.out.println("Hell Car");
    }

    @PostConstruct  // new package needed jakarta-annotation-api
    public void initialize() {
        this.name = "test car (post construct)";
    }

    @PreDestroy
    void destroyLog() {
        System.out.println("GoodBye");
    }
}
