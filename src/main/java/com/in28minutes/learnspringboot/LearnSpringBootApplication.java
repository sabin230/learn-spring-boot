package com.in28minutes.learnspringboot;

import com.in28minutes.learnspringboot.model.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.List;

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
