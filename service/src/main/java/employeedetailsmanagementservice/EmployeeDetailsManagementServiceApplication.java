package employeedetailsmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.peerislands.www.employee.details","employeedetailsmanagementservice"})
public class EmployeeDetailsManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailsManagementServiceApplication.class, args);
	}

}
