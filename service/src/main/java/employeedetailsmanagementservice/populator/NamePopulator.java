package employeedetailsmanagementservice.populator;

import com.peerislands.www.employee.details.domain.contracts.Employee;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NamePopulator implements IPopulator {

    @Override
    public void populate(Map<String,String> attributeMap, Employee employee) {
        String name = attributeMap.get("Name");
        employee.setName(name);
    }
}
