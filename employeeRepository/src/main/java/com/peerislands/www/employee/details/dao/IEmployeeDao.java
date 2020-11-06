package com.peerislands.www.employee.details.dao;

import com.peerislands.www.employee.details.domain.dto.Employee;

import java.util.List;

public interface IEmployeeDao {

    // List<Employee> getEmployeeDetails() throws Exception;

    void saveEmployeeDetails(Employee employee) throws Exception;

    void deleteEmployeeDetails(Long employeeId) throws Exception;
}
