package com.in28minutes.learnspringboot.component;
public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
//Component annotation is not here so it is implemented as Configuration which defines a bean
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
