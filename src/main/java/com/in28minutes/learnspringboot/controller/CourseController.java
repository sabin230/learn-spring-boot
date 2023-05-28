package com.in28minutes.learnspringboot.controller;

import com.in28minutes.learnspringboot.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList( new Course(1,"Learn AWS","in28minutes"),
                new Course(2,"Learn DevOps","in28minutes"),
                new Course(3,"Learn devtools","in28minutes"),
                new Course(4,"Learn Oracle","in28minutes")
        );
    }
}
