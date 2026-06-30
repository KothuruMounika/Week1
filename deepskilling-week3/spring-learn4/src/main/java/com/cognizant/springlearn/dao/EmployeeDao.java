package com.cognizant.springlearn.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.model.Skill;

@Repository
public class EmployeeDao {

    private static List<Employee> employeeList = new ArrayList<>();

    static {

        try {

            Department department =
                    new Department(1, "IT");

            List<Skill> skills = new ArrayList<>();

            skills.add(new Skill(1, "Java"));
            skills.add(new Skill(2, "Spring Boot"));

            Employee employee = new Employee(
                    1,
                    "John",
                    50000.0,
                    true,
                    new SimpleDateFormat("dd/MM/yyyy")
                            .parse("10/10/2000"),
                    department,
                    skills);

            employeeList.add(employee);

        } catch (ParseException e) {

            e.printStackTrace();

        }

    }

    public List<Employee> getAllEmployees() {

        return employeeList;

    }

    public void updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getId().equals(employee.getId())) {

                employeeList.set(i, employee);

                return;

            }

        }

        throw new EmployeeNotFoundException("Employee not found");

    }

    public void deleteEmployee(int id)
            throws EmployeeNotFoundException {

        Iterator<Employee> iterator = employeeList.iterator();

        while (iterator.hasNext()) {

            Employee employee = iterator.next();

            if (employee.getId().equals(id)) {

                iterator.remove();

                return;

            }

        }

        throw new EmployeeNotFoundException("Employee not found");

    }

}