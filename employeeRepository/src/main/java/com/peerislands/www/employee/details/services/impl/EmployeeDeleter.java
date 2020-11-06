package com.peerislands.www.employee.details.services.impl;

import com.peerislands.www.employee.details.dao.IEmployeeDao;
import com.peerislands.www.employee.details.services.IDeleteEmployee;

public class EmployeeDeleter implements IDeleteEmployee {

    IEmployeeDao employeeDao;

    public EmployeeDeleter(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public boolean deleteEmployee(long employeeId) {
        try{
            employeeDao.deleteEmployeeDetails(employeeId);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
