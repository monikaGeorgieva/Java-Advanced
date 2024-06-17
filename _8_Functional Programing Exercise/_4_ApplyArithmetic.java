import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _4_ApplyArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
        String commands = scanner.nextLine();


        Function<List<Integer>,List<Integer>> addFunction = listOfNumbers -> listOfNumbers.stream().map(number -> number + 1).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> multiplyFunction = listOfNumbers -> listOfNumbers.stream().map(number -> number * 2).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> subtract = listOfNumbers -> listOfNumbers.stream().map(number -> number - 1).collect(Collectors.toList());


        while (!commands.equals("end")){
            switch (commands){
                case "add":
                    numbers = addFunction.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyFunction.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(number -> System.out.print(number + " "));
                    System.out.println();
                    break;
            }
        }

    }
}
//1 2 3 4 5
//add
//add
//print
//end
//output:
//3 4 5 6 7
