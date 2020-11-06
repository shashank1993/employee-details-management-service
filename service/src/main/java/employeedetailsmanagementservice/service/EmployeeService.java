package employeedetailsmanagementservice.service;

import com.peerislands.www.employee.details.EmployeeDetails;
import com.peerislands.www.employee.details.domain.contracts.Employee;
import employeedetailsmanagementservice.populator.AllFieldsPopulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService implements IEmployeeService {

    private EmployeeDetails employeeDetails;
    private AllFieldsPopulator allFieldsPopulator;

    @Autowired
    EmployeeService(EmployeeDetails employeeDetails,
                    AllFieldsPopulator allFieldsPopulator) {
        this.employeeDetails = employeeDetails;
        this.allFieldsPopulator = allFieldsPopulator;
    }

    @Override
    public boolean addEmployee(Long employeeId) {
        Employee employee = allFieldsPopulator.populate(employeeId);
        return employeeDetails.addEmployee(employeeId, employee);
    }

    @Override
    public boolean deleteEmployee(Long employeeId) {
        return employeeDetails.deleteEmployee(employeeId);
    }
}
