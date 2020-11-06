package employeedetailsmanagementservice.populator;

import com.peerislands.www.employee.details.domain.contracts.Employee;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DesignationPopulator implements IPopulator {

    @Override
    public void populate(Map<String,String> attributeMap, Employee employee) {
        String designation = attributeMap.get("Designation");
        employee.setDesignation(designation);
    }
}
