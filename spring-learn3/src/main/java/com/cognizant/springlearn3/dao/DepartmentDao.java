package com.cognizant.springlearn3.dao;

import com.cognizant.springlearn3.model.Department;
import java.util.List;

public interface DepartmentDao {
    List<Department> getAllDepartments();
    Department getDepartment(int id);
}