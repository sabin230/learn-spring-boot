package com.in28minutes.learnspringboot.dao;

import com.in28minutes.learnspringboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
