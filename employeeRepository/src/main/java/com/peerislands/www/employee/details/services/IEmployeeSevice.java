package com.peerislands.www.employee.details.services;

import com.peerislands.www.employee.details.domain.dto.Employee;

public interface IEmployeeSevice {

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(long employeeId);

}
