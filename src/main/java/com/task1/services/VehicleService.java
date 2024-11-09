package com.task1.services;

import com.task1.components.Speaker;
import com.task1.components.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    Speaker speaker;
    Tyre tyre;

    @Autowired
    VehicleService(@Qualifier("Dolby") Speaker speaker, @Qualifier("Michelin") Tyre tyre) {
        System.out.println("VehicleServices Created");
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
