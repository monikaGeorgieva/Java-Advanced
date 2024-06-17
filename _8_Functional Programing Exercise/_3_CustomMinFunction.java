import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _3_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //Function: аргумент -> извършва се действие с този аргумент и връща резултат
        Function<List<Integer>,Integer> function = listOfNumbers -> Collections.min(listOfNumbers);

        Integer minValue = function.apply(numbers);
        System.out.println(minValue);
    }
}
