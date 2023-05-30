package com.in28minutes.learnspringboot.controller.rest;

import com.in28minutes.learnspringboot.component.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    //Constructor has 2 private Coach variables
    //This is example of constructor injection
    public WorkoutController(@Qualifier("aquatic") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/dailyworkout2")
    public String getDailyWorkout2() {
        return anotherCoach.getDailyWorkout();
    }

}
