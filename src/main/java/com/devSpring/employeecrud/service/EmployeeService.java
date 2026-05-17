package com.devSpring.employeecrud.service;

import java.util.List;

import com.devSpring.employeecrud.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
