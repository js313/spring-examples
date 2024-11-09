package com.task1.components;

public class Tyre {
    String name;

    public Tyre() {
        System.out.println("Tyre created");
    }

    public void rotate() {
        System.out.println("Rotating.... " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
