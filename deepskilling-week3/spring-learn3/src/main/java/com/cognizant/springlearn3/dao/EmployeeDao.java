package com.cognizant.springlearn3.dao;

import com.cognizant.springlearn3.model.Employee;
import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
    Employee getEmployee(int id);
}