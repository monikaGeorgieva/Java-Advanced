import java.util.ArrayDeque;
import java.util.Scanner;

public class _3_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (number.equals(0)){
            System.out.println(0);
        }else{
            while (number != 0){
                stack.push(number % 2);
                number /= 2;
            }
        }
        while (!stack.isEmpty()){
            int num = stack.pop();
            System.out.print(num);
        }
    }
}
//1024
//output
//10000000000

//10
//output
//1010
