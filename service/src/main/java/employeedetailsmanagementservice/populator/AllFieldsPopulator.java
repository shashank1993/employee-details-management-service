package employeedetailsmanagementservice.populator;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.peerislands.www.employee.details.domain.contracts.Employee;
import employeedetailsmanagementservice.exceptions.EmployeeNotFoundException;
import employeedetailsmanagementservice.generator.IEmployeeAttributeGenerator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AllFieldsPopulator{

    Map<Long,Map<String,String>> employeeAttributeMap;
    List<IPopulator> populatorList;

    @Autowired
    public AllFieldsPopulator(List<IPopulator> populatorList, IEmployeeAttributeGenerator employeeAttributeGenerator) throws Exception {
        this.populatorList = populatorList;
        employeeAttributeMap = employeeAttributeGenerator.getEmployeeAttributeMap();

    }

    public Employee populate(Long employeeId) {
        Employee employee = new Employee();
        Map<String,String> attributeMap = employeeAttributeMap.get(employeeId);
        if(attributeMap == null) {
            throw new EmployeeNotFoundException();
        }
        for(IPopulator populator: populatorList) {
            populator.populate(attributeMap, employee);
        }
        return employee;
    }

}
