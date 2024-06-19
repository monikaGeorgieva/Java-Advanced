package _2_CompanyRooster;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name){
        this.name = name;
        employees = new ArrayList<>();
    }
    public  double calculateAverageSalary(){
        return this.employees.stream()
                .mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    //средна заплата


    public String getName() {
        return name;
    }
}
