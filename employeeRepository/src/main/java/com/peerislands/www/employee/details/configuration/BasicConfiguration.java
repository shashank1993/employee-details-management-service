package com.peerislands.www.employee.details.configuration;

import com.peerislands.www.employee.details.EmployeeDetails;
import com.peerislands.www.employee.details.dao.EmployeeDao;
import com.peerislands.www.employee.details.dao.IEmployeeDao;
import com.peerislands.www.employee.details.domain.contracts.Employee;
import com.peerislands.www.employee.details.domain.dao.Employees;
import com.peerislands.www.employee.details.domain.mapper.DomainMapper;
import com.peerislands.www.employee.details.domain.mapper.IMapper;
import com.peerislands.www.employee.details.domain.mapper.impl.EmployeeContractMapper;
import com.peerislands.www.employee.details.domain.mapper.impl.EmployeeDaoMapper;
import com.peerislands.www.employee.details.domain.mapper.impl.EmployeeDtoMapper;
import com.peerislands.www.employee.details.services.IDeleteEmployee;
import com.peerislands.www.employee.details.services.IEmployeeAdder;
import com.peerislands.www.employee.details.services.IEmployeeSevice;
import com.peerislands.www.employee.details.services.impl.EmployeeAdder;
import com.peerislands.www.employee.details.services.impl.EmployeeDeleter;
import com.peerislands.www.employee.details.services.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.JAXBContext;

@Configuration
public class BasicConfiguration {

    @Bean
    public JAXBContext employeeJaxbContext() throws Exception{
        return JAXBContext.newInstance(Employees.class);
    }

    @Bean
    public IMapper<com.peerislands.www.employee.details.domain.dto.Employee, Employees.Employee> employeeDaoMapper() {
        return new EmployeeDaoMapper();
    }

    @Bean
    @Autowired
    public IEmployeeDao employeeDao(IMapper<com.peerislands.www.employee.details.domain.dto.Employee, Employees.Employee> employeeDaoMapper,
                                    JAXBContext employeeJaxbContext) {
        return new EmployeeDao(employeeDaoMapper, employeeJaxbContext, "employee.xml");
    }

    @Bean
    @Autowired
    public IEmployeeAdder addEmployee(IEmployeeDao employeeDao) {
        return new EmployeeAdder(employeeDao);
    }

    @Bean
    @Autowired
    public IDeleteEmployee employeeDeletor(IEmployeeDao employeeDao) {
        return new EmployeeDeleter(employeeDao);
    }

    @Bean
    @Autowired
    public IEmployeeSevice employeeSevice(IEmployeeAdder employeeAdder, IDeleteEmployee deleteEmployee) {
        return new EmployeeService(employeeAdder, deleteEmployee);
    }

    @Bean
    @Autowired
    public EmployeeDetails employeeDetails(IEmployeeSevice employeeSevice,
                                           DomainMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> employeeMapper) {
        return new EmployeeDetails(employeeSevice, employeeMapper);
    }

    @Bean
    public IMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> employeeDtoMapper() {
        return new EmployeeDtoMapper();
    }

    @Bean
    public IMapper<com.peerislands.www.employee.details.domain.dto.Employee, Employee> employeeContractMapper() {
        return new EmployeeContractMapper();
    }

    @Bean
    @Autowired
    public DomainMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> employeeDomainMapper(IMapper<Employee, com.peerislands.www.employee.details.domain.dto.Employee> toDomainMapper,
                                                                                                                 IMapper<com.peerislands.www.employee.details.domain.dto.Employee, Employee> fromDomainMapper) {
        return new DomainMapper<>(toDomainMapper, fromDomainMapper);
    }




}
