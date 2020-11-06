package employeedetailsmanagementservice.populator;


import com.peerislands.www.employee.details.domain.contracts.Employee;

import java.util.Map;

public interface IPopulator {
    public void populate(Map<String, String> attributeMap, Employee employee);
}
