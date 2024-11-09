package com.example8.components;

import com.example8.interfaces.Speaker;

public class SonySpeaker implements Speaker {
    SonySpeaker() {
        System.out.println("Sony Speaker created");
    }

    @Override
    public void PlayMusic(String name) {
        System.out.println("Now Playing "+name+" with Sony speakers...");
    }

    @Override
    public void StopMusic() {
        System.out.println("Music Stopped from Sony speakers...");
    }
}
