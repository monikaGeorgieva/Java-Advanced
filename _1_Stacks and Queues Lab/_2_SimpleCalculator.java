import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] tokens = input.split("\\s+");
        ArrayDeque <String> stack = new ArrayDeque<>();

        for (int i = tokens.length - 1; i >= 0 ; i--) {
            String token = tokens[i];
            stack.push(token);
        }

        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());


            switch (op){
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
