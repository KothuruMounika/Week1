package com.cognizant.springlearn3.service;

import com.cognizant.springlearn3.dao.EmployeeDao;
import com.cognizant.springlearn3.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }
}