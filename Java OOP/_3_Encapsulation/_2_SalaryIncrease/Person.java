package _2_SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;

    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName, lastName, age);
        setSalary(salary);
    }

     public String getFirstName() {
        return firstName;
    }

     public String getLastName() {
        return lastName;
    }

     public  int getAge() {
         return age;
     }
    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }
    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }
    public void increaseSalary(double bonus) {
        double actualBonus = bonus;
        if (age < 30) {
            actualBonus /= 2; // actualBonus = actualBonus / 2;
        }

        double newSalary = salary * (1 + actualBonus / 100);
        setSalary(newSalary);
    }
    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva", firstName, lastName, salary);
    }
}
