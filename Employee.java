import java.util.UUID;

public class Employee {

    private final String id;   // immutable unique identifier
    private String firstName;
    private String lastName;
    private String employeeType;
    private String department;
    private String job;

    // Constructor: UUID is generated internally
    public Employee(String firstName, String lastName,
                    String employeeType, String department, String job) {

        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
        this.department = department;
        this.job = job;
    }

    // Getter only (NO setter for ID)
    public String getID() {
        return id;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

     public String getFirstName() {
        return firstName;
    }


    // setters & getters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public String getDepartment() {
        return department;
    }

    public String getJob() {
        return job;
    }
}
