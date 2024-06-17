

import java.util.*;
import java.util.stream.Collectors;

public class _1_SortEvenNumbers {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     //1. входни данни -> 4, 2, 1, 3, 5, 7, 1, 4, 2, 12
        List<Integer> numbers =Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //2.принтираме четните
        numbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        numbers.forEach(n -> System.out.print(n + " "));
        //3.сортирааме в нарастващ ред
        Collections.sort(numbers);

        //4.принтиране на четните числа
        System.out.println();
        printListWithComa(numbers);

    }
    public  static void printListWithComa(List<Integer> numbers){
        List<String> numberAsText = new ArrayList<>();
        for (int number: numbers) {
            numberAsText.add(String.valueOf(number));
        }
        System.out.println(String.join(", ",numberAsText));
    }
}
//4, 2, 1, 3, 5, 7, 1, 4, 2, 12
