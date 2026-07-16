package com.cognizant.springlearn3.dao;

import com.cognizant.springlearn3.model.Department;
import com.cognizant.springlearn3.model.Employee;
import com.cognizant.springlearn3.model.Skill;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private static final List<Employee> employeeList = new ArrayList<>();

    static {

        Department dept1 = new Department(1, "IT");
        Department dept2 = new Department(2, "HR");

        List<Skill> skills1 = new ArrayList<>();
        skills1.add(new Skill(1, "Java"));
        skills1.add(new Skill(2, "Spring Boot"));

        List<Skill> skills2 = new ArrayList<>();
        skills2.add(new Skill(3, "SQL"));
        skills2.add(new Skill(4, "Python"));

        employeeList.add(
                new Employee(
                        1,
                        "John",
                        50000,
                        true,
                        dept1,
                        skills1,
                        new Date()
                )
        );

        employeeList.add(
                new Employee(
                        2,
                        "Emma",
                        60000,
                        true,
                        dept2,
                        skills2,
                        new Date()
                )
        );
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}