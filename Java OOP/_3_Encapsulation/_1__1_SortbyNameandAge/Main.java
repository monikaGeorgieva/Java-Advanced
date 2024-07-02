package _1_SortbyNameandAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = reader.readLine().split(" ");

            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));

        }

        Collections.sort(people, (firstPerson, secondPerson) -> {

            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (sComp != 0) {

                return sComp;

            } else {

                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());

            }

        });

        for (Person person : people) {

            System.out.println(person.toString());

        }

    }
}
//5
//Angel Ivanov 65
//Boris Georgiev 57
//Veny Ivanov 27
//Angel Harizanov 44
//Boris Angelov 35

//output:
//Angel Harizanov is 44 years old.
//Angel Ivanov is 65 years old.
//Boris Angelov is 35 years old.
//Boris Georgiev is 57 years old.
//Veny Ivanov is 27 years old.
