import java.util.ArrayList;
import java.util.List;

public class EmployeeManger {

    List<Employee> employees = new ArrayList<>();

    public void AddEmployee() {
        employees.add(null)
    }

     public void RemoveEmployee() {
        for(int i =0; i< employees.size(); i++){
            if(employees[i] == "firstName"){
                employees.remove(i)
            }
        }
    }

     public void UpdateEmployee() {
        
    }

     public void FindEmployee() {
        
    }
}
