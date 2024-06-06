import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = input[0]; //number of elements to push into the stack
        int s = input[1]; //number of elements to pop from the stack
        int x = input[2]; //check whether is present in the stack

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int count = 1; count <= n ; count++) {
           int number = scanner.nextInt(); //!!!!!!!!!
           stack.push(number);
            //scanner.nextInt(); ---> взима следващия int от конзолата
        }

        for (int count = 1; count <= s ; count++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println("true");
        }else {
            System.out.println(Collections.min(stack));
        }
    }
}
//5 2 13
//1 13 45 32 4
//output:
//true
