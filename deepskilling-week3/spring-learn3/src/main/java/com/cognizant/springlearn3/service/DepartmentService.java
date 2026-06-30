package com.cognizant.springlearn3.service;

import com.cognizant.springlearn3.dao.DepartmentDao;
import com.cognizant.springlearn3.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentDao departmentDao;

    @Autowired
    public DepartmentService(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }

    public Department getDepartment(int id) {
        return departmentDao.getDepartment(id);
    }
}