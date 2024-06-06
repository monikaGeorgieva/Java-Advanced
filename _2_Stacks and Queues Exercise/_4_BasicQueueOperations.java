import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = input[0];
        int s = input[1];
        int x = input[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int count = 1; count <= n ; count++) {
            int number = scanner.nextInt();
            queue.offer(number);
            //scanner.nextInt(); ---> взима следващия int от конзолата
        }

        for (int count = 1; count <= s ; count++) {
            queue.poll();
        }

        if (queue.isEmpty()){
            System.out.println(0);
        } else if (queue.contains(x)) {
            System.out.println("true");
        }else {
            System.out.println(Collections.min(queue));
        }
    }
}
//5 2 16
//1 13 45 32 4
//output:
//4

