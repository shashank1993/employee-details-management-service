package employeedetailsmanagementservice.populator;

import com.peerislands.www.employee.details.domain.contracts.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AgePopulator implements IPopulator{

    private static final Logger LOGGER = LoggerFactory.getLogger(AgePopulator.class);
    @Override
    public void populate(Map<String,String> attributeMap, Employee employee) {
        String age = attributeMap.get("Age");
        try {

            employee.setAge(Integer.parseInt(age));
        }catch (Exception ex) {
            LOGGER.error("Error while setting age of employee" , ex);
        }
    }
}
