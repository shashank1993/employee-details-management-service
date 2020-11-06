package com.peerislands.www.employee.details.domain.mapper.impl;

import com.peerislands.www.employee.details.domain.contracts.Employee;
import com.peerislands.www.employee.details.domain.mapper.DomainMapper;
import com.peerislands.www.employee.details.domain.mapper.IMapper;

public class EmployeeDomainMapper extends DomainMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> {

    public EmployeeDomainMapper(IMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> toDomainMapper, IMapper<com.peerislands.www.employee.details.domain.dto.Employee, Employee> fromDomainMapper) {
        super(toDomainMapper, fromDomainMapper);
    }


}
