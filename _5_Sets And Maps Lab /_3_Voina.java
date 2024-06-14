import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayes = ReadSet(scanner);
        LinkedHashSet<Integer> secondPlayes = ReadSet(scanner);

        int rounds = 50;
        while (rounds-- > 0 && !firstPlayes.isEmpty() && !secondPlayes.isEmpty()){
            int firstNumber  = 0;
            for (Integer n :firstPlayes) {
                firstNumber = n;
                break;
            }
            int secondNumber = 0;
            for (Integer n :secondPlayes) {
                secondNumber = n;
                break;
            }
        }


        //ЗА ДОВЪРШВАНЕ
    }

    private static LinkedHashSet<Integer> ReadSet(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
