package com.peerislands.www.employee.details.dao;

import com.peerislands.www.employee.details.domain.dao.Employees;
import com.peerislands.www.employee.details.domain.dto.Employee;
import com.peerislands.www.employee.details.domain.mapper.DomainMapper;
import com.peerislands.www.employee.details.domain.mapper.IMapper;
import org.springframework.util.CollectionUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDao implements IEmployeeDao {

    private JAXBContext context;
    private String fileName;
    private Employees employees;
    private IMapper<Employee, Employees.Employee> employeeDaoMapper;

    public EmployeeDao(IMapper<Employee, Employees.Employee> employeeDaoMapper, JAXBContext context, String filename) {
        this.context = context;
        this.fileName = filename;
        this.employees = null;
        this.employeeDaoMapper = employeeDaoMapper;
    }

    public void saveEmployeeDetails(com.peerislands.www.employee.details.domain.dto.Employee employee) throws Exception {
        Employees.Employee employeeDaoObject = employeeDaoMapper.map(employee);
        Employees employees = getEmployeeDetails();
        Optional<Employees.Employee> employee1 = Optional.ofNullable(employees).map(x -> x.getEmployee()).orElse(new ArrayList<>())
                .stream().filter(x -> x!= null).filter(x -> x.getEmployeeId() == employee.getEmployeeId()).findAny();
        if(!employee1.isPresent()) {
            employees.getEmployee().add(employeeDaoObject);
            saveEmployeeDetails(employees);
        }
    }

    public void deleteEmployeeDetails(Long employeeId) throws Exception {

        Employees employees = getEmployeeDetails();
        List<Employees.Employee> employee1 = Optional.ofNullable(employees).map(x -> x.getEmployee()).orElse(new ArrayList<>())
                .stream().filter(x -> x!= null).filter(x -> x.getEmployeeId() != employeeId).collect(Collectors.toList());
        if(employee1.size() != employees.getEmployee().size()) {
            employees = new Employees();
            employees.getEmployee().addAll(employee1);
            saveEmployeeDetails(employees);
        }
    }

    private synchronized void saveEmployeeDetails(Employees employees) throws Exception{
        XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)));
        e.writeObject(employees);
        e.close();

        this.employees = employees;

        File file = new File(fileName);

        Marshaller marshaller = context.createMarshaller();

        // enable pretty-print XML output
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // convert user object to XML file
        marshaller.marshal(employees, file);
    }



    private Employees getEmployeeDetails() throws Exception {

        if(employees == null || CollectionUtils.isEmpty(employees.getEmployee())) {
            File file = new File(fileName);

            // create an instance of `Unmarshaller`
            try {
                Unmarshaller unmarshaller = context.createUnmarshaller();
                employees = new Employees();
                employees = (Employees) unmarshaller.unmarshal(file);
            }catch (Exception ex) {
                employees = new Employees();
            }

        }

        return employees;
    }
}
