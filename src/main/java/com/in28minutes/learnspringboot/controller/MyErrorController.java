package com.in28minutes.learnspringboot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        //do something like logging
        System.out.println("Even without this controller , by default it display error.html");
        //worked only after adding thymeleaf dependency
        return "error";
    }

}
