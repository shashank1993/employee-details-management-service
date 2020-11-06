package com.peerislands.www.employee.details.services.impl;

import com.peerislands.www.employee.details.domain.dto.Employee;
import com.peerislands.www.employee.details.services.IDeleteEmployee;
import com.peerislands.www.employee.details.services.IEmployeeAdder;
import com.peerislands.www.employee.details.services.IEmployeeSevice;

public class EmployeeService implements IEmployeeSevice {
    IEmployeeAdder employeeAdder;
    IDeleteEmployee employeeDeleter;

    public EmployeeService(IEmployeeAdder employeeAdder, IDeleteEmployee employeeDeleter) {
        this.employeeAdder  = employeeAdder;
        this.employeeDeleter = employeeDeleter;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employeeAdder.addEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(long employeeId) {
        return employeeDeleter.deleteEmployee(employeeId);
    }
}
