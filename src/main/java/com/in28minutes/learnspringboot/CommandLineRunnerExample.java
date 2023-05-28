package com.in28minutes.learnspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//The CommandLineRunner interface in Spring Boot provides a way to execute code when a Spring Boot application starts up.
// It allows you to perform initialization tasks or run certain logic before the application is fully up and running.
// runs after Started LearnSpringBootApplication in 3.202
@Component
public class CommandLineRunnerExample implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //"sout" enter. is shortcut for System.out.println
        System.out.println("Hello from CommandLineRunner @Component!");
    }
}
