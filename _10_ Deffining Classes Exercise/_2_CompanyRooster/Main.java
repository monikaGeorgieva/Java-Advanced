package _2_CompanyRooster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEmploee = Integer.parseInt(scanner.nextLine());
        List<Employee> emploeeList = new ArrayList<>();
        Map<String,Department> departments =  new HashMap<>();

        for (int i = 0; i < countEmploee; i++) {
            String[] input = scanner.nextLine().split(" ");

            String name = input[0];
            double  salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = null;
            if (input.length == 4){
                employee = new Employee(name,salary,position,department);
            }else if (input.length == 6){
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name,salary,position,department,email ,age);
            }else if (input.length == 5){
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name,salary,position,department,age);
                } catch (NumberFormatException e){
                    String email = input[4];
                    employee = new Employee(name,salary,position,department,email);
                }
            }
            departments.putIfAbsent(department, new Department(department)); //->сложихме отдела ако го има
            departments.get(department).getEmployees().add(employee);


        }
        //минаваме през мапа зада намерим най-високата заплата
        // --->  Map<String,Department> departments =  new HashMap<>();
        Department highestPaidDepartment = departments
                .entrySet()
                .stream()
                .max(Comparator.comparing(entry -> entry.getValue().calculateAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(),e1.getSalary()))
                .forEach(System.out::println);
    }
}
//4
//Peter 120.00 Dev Development peter@abv.bg 28
//Tina 333.33 Manager Marketing 33
//Sam 840.20 ProjectLeader Development sam@sam.com
//George 0.20 Freeloader Nowhere 18
