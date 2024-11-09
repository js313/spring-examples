package com.task1.components;

public class Speaker {
    String name;

    public Speaker() {
        System.out.println("Speaker created");
    }

    public void play() {
        System.out.println("Playing... with " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
