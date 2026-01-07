  // Controlled types for scalability
enum EmployeeType {
    INTERN, FULL_TIME, CONTRACTOR
}

enum Department {
    ENGINEERING, HR, SALES, MARKETING
}

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeType;
    private String department;
    private String job;

    // Constructor: only required fields for valid employee
    public Employee(String firstName, String lastName, String employeeType, String department, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
        this.department = department;
        this.job = job;
    }

    // ====== Getters ======
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName; // derive on demand
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

    // ====== Setters ======
    // Only mutate things that can change in real life
    public void setJob(String job) {
        this.job = job;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    // ====== Behavior Example ======
    // public boolean isFullTime() {
    //     return this.employeeType == EmployeeType.FULL_TIME;
    // }

    // public boolean isEligibleForPromotion() {
    //     return this.employeeType != EmployeeType.INTERN && this.job != null;
    // }
}
