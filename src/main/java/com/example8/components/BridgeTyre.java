package com.example8.components;

import com.example8.interfaces.Tyre;

public class BridgeTyre implements Tyre {
    BridgeTyre() {
        System.out.println("Bridge Tyre created");
    }

    @Override
    public void Start() {
        System.out.println("Starting Bridge Tyres...");
    }

    @Override
    public void Stop() {
        System.out.println("Braking Bridge Tyres...");
    }
}
