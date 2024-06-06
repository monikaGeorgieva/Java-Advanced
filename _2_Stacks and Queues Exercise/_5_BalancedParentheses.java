import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        //{[()]}
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char parenthesis: expression.toCharArray()) {

            if (parenthesis == '{' || parenthesis == '[' || parenthesis == '('){
                stack.push(parenthesis);
            }else {
                if (stack.isEmpty() || !areMatchingParentheses(stack.pop(),parenthesis)){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    private static boolean areMatchingParentheses(char openParenthesis,char closeParenthesis){
        if (openParenthesis == '{'){
            return closeParenthesis == '}';
        } else if (openParenthesis == '[') {
            return closeParenthesis == ']';
        }else {
            return closeParenthesis == ')';
        }
    }
}
//{[()]}
//output:
//YES
