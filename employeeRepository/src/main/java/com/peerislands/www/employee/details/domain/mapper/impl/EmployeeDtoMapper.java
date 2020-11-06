package com.peerislands.www.employee.details.domain.mapper.impl;

import com.peerislands.www.employee.details.domain.contracts.Employee;
import com.peerislands.www.employee.details.domain.mapper.IMapper;

public class EmployeeDtoMapper implements IMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee>  {

    @Override
    public com.peerislands.www.employee.details.domain.dto.Employee map(Employee A) {
        com.peerislands.www.employee.details.domain.dto.Employee employeeDto = new  com.peerislands.www.employee.details.domain.dto.Employee();
        employeeDto.setAge(A.getAge());
        employeeDto.setAny(A.getAny());
        employeeDto.setDesignation(A.getDesignation());
        employeeDto.setName(A.getName());
        return employeeDto;
    }
}
