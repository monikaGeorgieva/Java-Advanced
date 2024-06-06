import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _3_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= n ; count++) {
            int [] input = Arrays.stream(scanner.nextLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            switch (input[0]){
                case 1 -> stack.push(input[1]);
                case 2 -> stack.pop();
                case 3 -> System.out.println(Collections.max(stack));
            }
        }
    }

}
//9
//1 97
//2
//1 20
//2
//1 26
//1 20
//3
//1 91
//3
//output:
//26
//91
