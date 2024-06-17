import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _5_ReverceAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        //number -> number % n == 0
        //Predicate : връща булева стойност
        Predicate<Integer> predicate = number -> number % n == 0;

        numbers.removeIf(predicate);
        numbers.forEach(number -> System.out.println(number + " "));
    }
}
//1 2 3 4 5 5
//2
//output:
//5 3 1
