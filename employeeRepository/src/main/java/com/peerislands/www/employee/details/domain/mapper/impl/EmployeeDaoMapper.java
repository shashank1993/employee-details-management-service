package com.peerislands.www.employee.details.domain.mapper.impl;

import com.peerislands.www.employee.details.domain.dao.Employees;
import com.peerislands.www.employee.details.domain.dto.Employee;
import com.peerislands.www.employee.details.domain.mapper.IMapper;

public class EmployeeDaoMapper implements IMapper<Employee, Employees.Employee>{

    @Override
    public Employees.Employee map(Employee A) {
        Employees.Employee employee = new Employees.Employee();
        employee.setEmployeeId(A.getEmployeeId());
        employee.setAge(A.getAge());
        employee.setDesignation(A.getDesignation());
        employee.setName(A.getName());
        return employee;
    }
}
