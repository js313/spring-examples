package com.example8.components;

import com.example8.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("BoseSpeaker")
public class BoseSpeaker implements Speaker {
    BoseSpeaker() {
        System.out.println("Bose Speaker created");
    }

    @Override
    public void PlayMusic(String name) {
        System.out.println("Now Playing "+name+" with Bose speakers...");
    }

    @Override
    public void StopMusic() {
        System.out.println("Music Stopped from Bose speakers...");
    }
}
