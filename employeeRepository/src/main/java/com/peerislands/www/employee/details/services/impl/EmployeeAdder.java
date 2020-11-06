package com.peerislands.www.employee.details.services.impl;

import com.peerislands.www.employee.details.dao.IEmployeeDao;
import com.peerislands.www.employee.details.domain.dto.Employee;
import com.peerislands.www.employee.details.services.IEmployeeAdder;

public class EmployeeAdder implements IEmployeeAdder {

    IEmployeeDao employeeDao;

    public EmployeeAdder(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        try {
            employeeDao.saveEmployeeDetails(employee);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
