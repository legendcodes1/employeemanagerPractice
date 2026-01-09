import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Create the EmployeeManager instance
        EmployeeManager manager = new EmployeeManager();

        int message = -1; // initialize to a non-exit value

        // 2. Menu loop
        while (message != 8) {

            // Print menu each iteration
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. List All");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");

            // Read input
            message = Integer.parseInt(scanner.nextLine());

            // Handle selection
            switch (message) {

                case 1: // Add Employee
                    System.out.println("Adding a new Employee:");
                    UUID uuid = UUID.randomUUID();
                    String id = uuid.toString();
                    System.out.println("Enter first name:");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter last name:");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter employment type:");
                    String employeeType = scanner.nextLine();

                    System.out.println("Enter department:");
                    String department = scanner.nextLine();

                    System.out.println("Enter job:");
                    String job = scanner.nextLine();

                    // Create Employee object
                    Employee emp = new Employee(firstName, lastName, employeeType, department, job);

                    // Call manager to store employee
                    manager.addEmployee(emp);
                    System.out.println("Employee added successfully!");
                    break;

                case 2: // Remove Employee
                    System.out.println("Removing an Employee:");
                    manager.RemoveEmployee();
                    break;

                case 3: // Update Employee
                    System.out.println("Whats the Employees ID that you are trying to update");
                    String empid = scanner.nextLine();
                    System.out.println("What are you trying to update [last name, department or employeement type]: ");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("Last name")){
                        System.out.println("Whats the new name");                        
                        String nameChange = scanner.nextLine();
                        manager.UpdateEmployee(empid, "Last name",nameChange);
                    } else if(choice.equalsIgnoreCase("Department")){
                        System.out.println("Whats the new Department");                        
                        String departmentChange = scanner.nextLine();
                        manager.UpdateEmployee(empid, "Department", departmentChange);
                    }else{
                        System.out.println("Whats the new employement type");                        
                        String employeementChange = scanner.nextLine();
                        manager.UpdateEmployee(empid,"Employement type" ,employeementChange);
                    }
                    break;

                case 4: // Search Employee
                    System.out.println("What is the Employees ID: ");
                    String foundid = scanner.nextLine();
                    manager.findEmployee(foundid);
                    break;

                case 5: // List All Employees
                    System.out.println("Listing all Employees:");
                    manager.listAllEmployees();
                    break;

                case 6: // Save to File
                    System.out.println("Saving employees to file:");
                    manager.saveToFile();
                    break;

                case 7: // Load from File
                    System.out.println("Loading employees from file:");
                    manager.loadFromFile();
                    break;

                case 8: // Exit
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
