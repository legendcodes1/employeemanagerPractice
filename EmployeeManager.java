import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;
import java.util.*;

public class EmployeeManager {

    List<Employee> employees = new ArrayList<>();
    Employee emp ;
    Scanner scanner = new Scanner(System.in);
    // FileWriter writer = new FileWriter("employees.txt");
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

     public void UpdateEmployee() {
        System.out.println("Whats the Employees first name that you are trying to update");
        String employee = scanner.nextLine();
        System.out.println("What are trying to update name, department or employeement type");
        for(int i = 0; i < employees.size(); i++){
            if (employees.get(i).getFirstName().equalsIgnoreCase(employee)){
                employees.get(i).setDepartment(employee);
            }
        }
    }

     public void findEmployee() {
        System.out.println("What is the Employees first Name");
        String name = scanner.nextLine();

        for(int i =0; i < employees.size(); i++){
            if (employees.get(i).getFirstName().equalsIgnoreCase(name)){
                System.out.println("Full name :" + employees.get(i).getFullName()   + "\n " 
                + "Employment Type:" + employees.get(i).getEmployeeType() + "\n " 
                + "Department: " + employees.get(i).getDepartment() + "\n " 
                + "Job: " + employees.get(i).getJob()
            );
            } else{
                System.out.println("Employee not found");
            }
        }
    }

    public void listAllEmployees(){
        for(int i =0; i < employees.size(); i++){
            // Employee currentEmployee = employees.get(i);
            if (employees.size() > 0){
                System.out.println(employees.get(i).getFullName());
            }else{
                System.out.println("No employees exist add one");
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