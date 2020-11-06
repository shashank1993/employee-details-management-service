package employeedetailsmanagementservice.generator;

import java.util.Map;

public interface IEmployeeAttributeGenerator {

    Map<Long,Map<String,String>> getEmployeeAttributeMap() throws Exception;
}
