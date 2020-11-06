package employeedetailsmanagementservice.resources;

import employeedetailsmanagementservice.exceptions.EmployeeNotFoundException;
import employeedetailsmanagementservice.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private IEmployeeService employeeService;

    @Autowired
    public EmployeeController(IEmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping(value="/{employeeId}")
    public ResponseEntity addEmployee(@PathVariable(value = "employeeId") Long employeeId) throws Exception{
        try {
            if (employeeService.addEmployee(employeeId))
                return new ResponseEntity(HttpStatus.OK);
            else
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (EmployeeNotFoundException ex) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value="/{employeeId}", consumes = "application/xml")
    public ResponseEntity deleteEmployee(@PathVariable(value = "employeeId") Long employeeId) {
        if(employeeService.deleteEmployee(employeeId))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}