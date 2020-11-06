package employeedetailsmanagementservice.generator;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeAttributeGenerator implements IEmployeeAttributeGenerator {

    public Map<Long,Map<String,String>> getEmployeeAttributeMap() throws Exception {
        FileReader filereader = new FileReader("csv/EmployeeDetails.csv");

        // create csvParser object with
        // custom seperator semi-colon
        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

        // create csvReader object with parameter
        // filereader and parser
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .withCSVParser(parser)
                .build();

        Map<Long,Map<String,String>> attributeMap = new HashMap<Long,Map<String,String>>();
        // Read all data at once
        List<String[]> allData = csvReader.readAll();
        List<String> attributest = Arrays.asList(allData.get(0)[0].split(","));
        for(int i=1;i<allData.size();i++) {
            List<String> list = Arrays.asList(allData.get(i)[0].split(","));
            Long id = Long.parseLong(list.get(0));
            Map<String, String> map = new HashMap<>();
            for(int j=0;j<attributest.size() && j<list.size();j++) {
                if(StringUtils.isNotBlank(list.get(j))){
                    map.put(attributest.get(j), list.get(j));
                }
            }
            attributeMap.put(id, map);
        }

        return attributeMap;
    }
}
