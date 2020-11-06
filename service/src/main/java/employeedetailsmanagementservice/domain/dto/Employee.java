package employeedetailsmanagementservice.domain.dto;

public class Employee {

    private long employeeId;
    private String name;
    private byte age;
    private String designation;

    public long getEmployeeId() {
        return employeeId;
    }

    public Employee setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public byte getAge() {
        return age;
    }

    public Employee setAge(byte age) {
        this.age = age;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

}
