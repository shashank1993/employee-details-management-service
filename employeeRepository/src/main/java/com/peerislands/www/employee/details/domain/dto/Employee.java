package com.peerislands.www.employee.details.domain.dto;

import java.util.List;

public class Employee {

    private long employeeId;
    private String name;
    private int age;
    private String designation;
    private List<Object> any;

    public long getEmployeeId() {
        return employeeId;
    }

    public Employee setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public List<Object> getAny() {
        return any;
    }

    public Employee setAny(List<Object> any) {
        this.any = any;
        return this;
    }
}
