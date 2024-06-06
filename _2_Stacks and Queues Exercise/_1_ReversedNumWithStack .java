import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _1_ReversedNumWithStack {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
      int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
              .mapToInt(Integer::parseInt)
              .toArray();
     // Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(stack::push);

        for (int number: numbers) {
            stack.push(number);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
//1 2 3 4 5
