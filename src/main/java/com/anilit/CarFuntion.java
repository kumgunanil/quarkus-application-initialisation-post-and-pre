package com.anilit;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;

public class CarFuntion {

    public void setRace(@Observes StartupEvent startupEvent) {
        System.out.println("Car is running....");
    }

    public void setBreak(@Observes ShutdownEvent shutDownEvent) {
        System.out.println("Applying the break.......");
    }
}
