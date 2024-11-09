package com.example8.services;

import com.example8.interfaces.Speaker;
import com.example8.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component("VehicleService")
public class VehicleService {
    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    final Speaker speaker;
    final Tyre tyre;

    @Autowired
    VehicleService(@Qualifier("MichelinTyre") Tyre tyre, @Qualifier("BoseSpeaker") Speaker speaker) {
        System.out.println("VehicleService created");
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public void playMusic(String name, boolean isVehicleStarted) {
        Instant start = Instant.now();
        logger.info("method execution start");
        String music = null;
        if(isVehicleStarted){
            speaker.PlayMusic(name);
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the" +
                    " operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
    }

    public void moveVehicle(boolean isVehicleStarted) {
        if(!isVehicleStarted) {
            System.out.println("Vehicle not started, cannot Play Music");
            return;
        }
        tyre.Start();
    }

    public void stopVehicle(boolean isVehicleStarted) {
        if(!isVehicleStarted) {
            System.out.println("Vehicle not started, cannot Play Music");
            return;
        }
        tyre.Stop();
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
