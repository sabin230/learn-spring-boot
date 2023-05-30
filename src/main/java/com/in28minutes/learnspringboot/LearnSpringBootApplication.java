package com.in28minutes.learnspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

	private static Logger LOG = LoggerFactory
			.getLogger(LearnSpringBootApplication.class);//This is current class name

	public static void main(String[] args) {
		//print before everything
		System.out.println("Hello from Main");
		LOG.info("STARTING THE APPLICATION"); //log will the date time , info , message
		SpringApplication.run(LearnSpringBootApplication.class, args);
		System.out.println("bye from main");
		LOG.info("APPLICATION Finish");
	}

}
