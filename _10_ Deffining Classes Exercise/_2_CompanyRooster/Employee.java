package _2_CompanyRooster;

public class Employee {
    //: name, salary, position, department, email and age
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email; //optional -може да ги има може да ги няма
    private int age; //optional

    public  Employee (String name,double salary,String position,String department){
        //конструктор
        //задължителни полета
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }
    public Employee(String name,double salary,String position,String department,String email,int age){
        //конструктор
//        this.name = name;
//        this.salary = salary;
//        this.position = position;
//        this.department = department;

        this(name,salary,position,department); //извикваме горния конструктор който сме създали предварително
        this.email = email;
        this.age = age;
    }
    public Employee(String  name,double salary,String position,String department,String email){
        this(name,salary,position,department);
        this.email = email;
    }

    public Employee(String name,double salary,String position,String department,int age){
        this(name,salary,position,department);
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return String.format("%s %.2f %s %d",this.name,this.salary,this.email,this.age);
    }
}
