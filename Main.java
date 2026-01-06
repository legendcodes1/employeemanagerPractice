import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create list
        List<Employee> employees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int message = -1;

        while (message != 8){
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. List All");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");

             // 2. Read input
            message = Integer.parseInt(scanner.nextLine());

           switch(message){
            case 1 :
                System.out.println("1. Add Employee");
                break;
            case 2:
                System.out.println("2. Remove Employee");
                break ;
            case 3 :
                System.out.println("3. Update Employee");
                break;
            case 4:
                System.out.println("4. Search Employee");
                break ;
            case 5:
                System.out.println("5. List All");
                break;
            case 6:
                System.out.println("6. Save to File");
                break ;
            case 7:
                System.out.println("7. Load from File");
                break;
            case 8:
                System.out.println("8. Exit");
                break ;
           }  
        }

        // Add employees
        // employees.add(new Employee("John", "Doe", EmployeeType.FULL_TIME, Department.ENGINEERING, "Software Engineer"));
        // employees.add(new Employee("Jane", "Smith", EmployeeType.INTERN, Department.HR, "HR Intern"));

        // // Iterate and print full names
        // for (Employee e : employees) {
        //     System.out.println(e.getFullName() + " - " + e.getJob());
        // }
    }
}
