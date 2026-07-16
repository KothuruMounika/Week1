package com.cognizant.springlearn3.dao;

import com.cognizant.springlearn3.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

    private static final List<Department> departmentList = new ArrayList<>();

    static {
        departmentList.add(new Department(1, "HR"));
        departmentList.add(new Department(2, "IT"));
        departmentList.add(new Department(3, "Finance"));
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentList;
    }

    @Override
    public Department getDepartment(int id) {
        return departmentList.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }
}