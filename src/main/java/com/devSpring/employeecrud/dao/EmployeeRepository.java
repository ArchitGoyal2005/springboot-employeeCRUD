package com.devSpring.employeecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSpring.employeecrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    
}
