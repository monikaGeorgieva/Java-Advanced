package _1_OpinionPool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < countPeople; i++) {
            String [] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            //създаваме си обект от тип Person
            Person person = new Person(name, age);
            people.add(person);
            //prints whose age is more than 30


        }
        //сортиране по възходяш ред
        people.stream()
                .filter(person1 -> person1.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
//3
//Peter 12
//Steven 31
//John 48
