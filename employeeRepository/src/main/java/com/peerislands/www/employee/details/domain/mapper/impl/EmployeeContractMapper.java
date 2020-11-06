package com.peerislands.www.employee.details.domain.mapper.impl;

import com.peerislands.www.employee.details.domain.contracts.Employee;
import com.peerislands.www.employee.details.domain.mapper.IMapper;

public class EmployeeContractMapper implements IMapper<com.peerislands.www.employee.details.domain.dto.Employee, Employee> {
    @Override
    public Employee map(com.peerislands.www.employee.details.domain.dto.Employee A) {
        Employee employee = new Employee();
        employee.setName(A.getName());
        employee.setAge(A.getAge());
        employee.setDesignation(A.getDesignation());
        employee.getAny().addAll(A.getAny());
        return employee;
    }
}
