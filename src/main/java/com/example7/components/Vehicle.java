package com.example7.components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)  // default scope is singleton.
// prototype scope creates new instances every time a bean is referred
// no eager instantiation of these types of beans is possible
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
