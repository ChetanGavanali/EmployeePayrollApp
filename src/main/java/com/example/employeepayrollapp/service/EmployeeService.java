package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    Repo repo;

    public Employee addEmployee(Employee employee) {
        Employee newEmployee = new Employee(employee);
        repo.save(employee);
        employee.toString();
        return newEmployee;
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}
