package com.in28minutes.learnspringboot.config;

import com.in28minutes.learnspringboot.component.Coach;
import com.in28minutes.learnspringboot.component.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //if 3rd party class cannot be annotated with Component, create class with Configuration annotation and define bean
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
