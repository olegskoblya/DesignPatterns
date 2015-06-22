package com.company.command.stereo;

/**
 * Created by oleg on 22.06.15.
 */
public class Stereo {
    private int volume;
    String name;

    public void on() {
        System.out.println("Stereo in " + name + " is on!");
    }
    public void off() {
        System.out.println("Stereo in " + name + " is off");
    }
    public void setCd() {
        System.out.println("CD in " + name + " is setted!");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Stereo(String name) {
        this.name = name;
    }
}
