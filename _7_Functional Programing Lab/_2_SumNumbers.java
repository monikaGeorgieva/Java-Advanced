import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _2_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Входни данни -> 4, 2, 1, 3, 5, 7, 1, 4, 2 ,12

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();
        //2.отпечатване :Брой на числата във въдения списък
        int countNumbers = numbers.size();

        //отпечатване   : сумата на числата
        Function<List<Integer>,Integer> sumElementsList = list -> {
            int sum = 0;
            for (int number: list) {
                sum += number;
            }
            return  sum;
        };
        int sumNumbers = sumElementsList.apply(numbers); //сума

        System.out.println("Count =" + countNumbers);
        System.out.println("Sum =" + sumNumbers);

    }
}
