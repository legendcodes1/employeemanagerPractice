import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;
import java.util.*;
import java.nio.file.Paths;
public class EmployeeManager {

    List<Employee> employees = new ArrayList<>();
    HashMap<String, Employee> employeeMap = new HashMap<>();
    Employee emp ;
    Scanner scanner = new Scanner(System.in);
    // FileWriter writer = new FileWriter("employees.txt");
    public void addEmployee(Employee emp) {
        employeeMap.put(emp.getID(), emp);
    }

     public void UpdateEmployee() {
        System.out.println("Whats the Employees ID that you are trying to update");
        String id = scanner.nextLine();
        emp = employeeMap.get(id);

        if (emp != null){
            System.out.println("What are you trying to update [last name, department or employeement type]: ");
            String choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("Department")){
                  emp.setDepartment(choice); 
            }else if(choice.equalsIgnoreCase("Employeement type")){
                emp.setEmployeeType(choice);
            }else if(choice.equalsIgnoreCase("Last name")){
                emp.setLastName(choice);
            }
            System.out.println("Updated successfully");
        }else{
            System.out.println("Employee does not exists");
        }
    }

     public void findEmployee() {
        System.out.println("What is the Employees ID: ");
        String id = scanner.nextLine();
        emp = employeeMap.get(id);

            if (emp != null){
                System.out.println("Full name :" + emp.getFullName()   + "\n " 
                + "Employment Type:" + emp.getEmployeeType() + "\n " 
                + "Department: " + emp.getDepartment() + "\n " 
                + "Job: " + emp.getJob()
            );
            } else{
                System.out.println("Employee not found");
            }
        }

    public void listAllEmployees(){
       if(employeeMap.isEmpty()){
        System.out.println("No employees exist. Add one first");
       }else{
        for(Employee emp: employeeMap.values()){
            System.out.println("ID: " + emp.getID() + "\n " +  "Full name: " + emp.getFullName() + "\n " +  "Job: " + emp.getJob());
        }
       }
    }

    public void RemoveEmployee() {
        System.out.println("What is the Employees first Name you want to delete");
        String name = scanner.nextLine();
        for(int i =0; i< employees.size(); i++){
            if (employees.get(i).getFirstName().equalsIgnoreCase(name)){
                employees.remove(i);
            }
        }
    }

    public void saveToFile(){
        try(PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))){
            for(Employee emp: employees){
            writer.println(emp.getFullName() + emp.getJob() + emp.getDepartment());
             }
            System.out.println("Data saved successfully");
        }catch(IOException e){
             System.err.println("Error sving to file" + e.getMessage());
          }
    }

    public void loadFromFile(){
        try(Scanner scanner = new Scanner(Paths.get("output.txt"))) {
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
