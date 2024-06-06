import java.util.ArrayDeque;
import java.util.Scanner;

public class _7_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int command = 1; command <= n ; command++) {
            String [] input = scanner.nextLine().split(" ");

            switch (input[0]){
                case "1": //1 abc
                    stack.push(text.toString());
                    text.append(input[1]);
                    break;
                case "2": //2 2
                    //abcd -- > ab
                    stack.push(text.toString());
                    int countToBeDeleted = Integer.parseInt(input[1]);
                    int startDeletiongPostition = text.length() - countToBeDeleted;
                    text.delete(startDeletiongPostition,text.length());
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]) - 1;
                    System.out.println(text.charAt(index));
                    break;
                case "4":
                    text = new StringBuilder(stack.pop());
                    break;
            }
        }
    }
}
//6
//1 Soft
//1 Uni
//2 1
//3 1
//1 be
//3 2
//output:
//S
//o
