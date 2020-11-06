package com.peerislands.www.employee.details;

import com.peerislands.www.employee.details.domain.contracts.Employee;
import com.peerislands.www.employee.details.domain.mapper.DomainMapper;
import com.peerislands.www.employee.details.services.IEmployeeSevice;

public class EmployeeDetails {

    IEmployeeSevice employeeSevice;
    DomainMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> employeeMapper;

    public EmployeeDetails(IEmployeeSevice employeeSevice, DomainMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> employeeMapper) {
        this.employeeSevice = employeeSevice;
        this.employeeMapper = employeeMapper;
    }

    public boolean addEmployee(Long employeeId, Employee employee) {
        com.peerislands.www.employee.details.domain.dto.Employee employeeDto = employeeMapper.toDomain(employee);
        employeeDto.setEmployeeId(employeeId);
        return employeeSevice.addEmployee(employeeDto);
    }

    public boolean deleteEmployee(long employeeId) {
        return employeeSevice.deleteEmployee(employeeId);
    }



}
