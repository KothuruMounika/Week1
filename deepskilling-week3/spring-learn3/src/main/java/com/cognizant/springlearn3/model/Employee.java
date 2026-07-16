package com.cognizant.springlearn3.model;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Employee.class);

    private int id;
    private String name;
    private double salary;
    private boolean permanent;
    private Department department;
    private List<Skill> skillList;
    private Date dateOfBirth;

    public Employee() {
        LOGGER.debug("Inside Employee Constructor.");
    }

    public Employee(int id, String name, double salary, boolean permanent,
                    Department department, List<Skill> skillList, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.permanent = permanent;
        this.department = department;
        this.skillList = skillList;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        LOGGER.debug("Inside getId()");
        return id;
    }

    public void setId(int id) {
        LOGGER.debug("Inside setId()");
        this.id = id;
    }

    public String getName() {
        LOGGER.debug("Inside getName()");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Inside setName()");
        this.name = name;
    }

    public double getSalary() {
        LOGGER.debug("Inside getSalary()");
        return salary;
    }

    public void setSalary(double salary) {
        LOGGER.debug("Inside setSalary()");
        this.salary = salary;
    }

    public boolean isPermanent() {
        LOGGER.debug("Inside isPermanent()");
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        LOGGER.debug("Inside setPermanent()");
        this.permanent = permanent;
    }

    public Department getDepartment() {
        LOGGER.debug("Inside getDepartment()");
        return department;
    }

    public void setDepartment(Department department) {
        LOGGER.debug("Inside setDepartment()");
        this.department = department;
    }

    public List<Skill> getSkillList() {
        LOGGER.debug("Inside getSkillList()");
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        LOGGER.debug("Inside setSkillList()");
        this.skillList = skillList;
    }

    public Date getDateOfBirth() {
        LOGGER.debug("Inside getDateOfBirth()");
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        LOGGER.debug("Inside setDateOfBirth()");
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
                + ", permanent=" + permanent + ", department=" + department
                + ", skillList=" + skillList + ", dateOfBirth=" + dateOfBirth + "]";
    }
}