package com.damein.damein.facade;

public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Light light = new Light();


        new HomeTheaterFacade(computer, light).stopMovie();
    }
}
