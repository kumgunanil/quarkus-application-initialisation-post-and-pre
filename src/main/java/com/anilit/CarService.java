package com.anilit;

import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Startup
public class CarService {

    @PostConstruct
    public void startEngine(){
        System.out.println("Starting the Engine...........");
    }

    @PreDestroy
    public void stopEngine(){
        System.out.println("Stopping the Engine...........");
    }


}
