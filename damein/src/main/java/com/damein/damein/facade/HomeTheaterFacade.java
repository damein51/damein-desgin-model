package com.damein.damein.facade;

public class HomeTheaterFacade {

    private Computer computer;
    private Light light;

    public HomeTheaterFacade(Computer computer, Light light) {
        this.computer = computer;
        this.light = light;
    }


    public void watchMovie() {
        light.off();
        computer.on();
    }

    public void stopMovie() {
        light.on();
        computer.off();
    }

}
