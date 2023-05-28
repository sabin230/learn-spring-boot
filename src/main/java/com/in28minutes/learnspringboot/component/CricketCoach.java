package com.in28minutes.learnspringboot.component;

import org.springframework.stereotype.Component;

@Component //indicates a class is a candidate for auto-detection and instantiation as a bean within the Spring context.
public class CricketCoach implements Coach {
//Constructor has same name as class
public CricketCoach(){System.out.println("In constructor: " + getClass().getSimpleName());}

    @Override
    public String getDailyWorkout() {
        return "Practice spin bowling for 15 min";
    }
}
