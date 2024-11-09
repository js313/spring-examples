package com.example8.components;

import com.example8.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("MichelinTyre")
public class MichelinTyre implements Tyre {
    MichelinTyre() {
        System.out.println("Michelin Tyre created");
    }

    @Override
    public void Start() {
        System.out.println("Starting Michelin Tyres...");
    }

    @Override
    public void Stop() {
        System.out.println("Braking Michelin Tyres...");
    }
}
