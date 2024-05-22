
import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ArrayDeque<Integer> indexes = new ArrayDeque<>();

        for (int i = 0; i < expression.length() ; i++) {
            char current = expression.charAt(i);
            if (current == '('){
                indexes.push(i);
            }else if (current == ')'){
                int begin = indexes.pop(); // дава последния елемент
                int end = i;
                String subExpression = expression.substring(begin,end + 1);
                //изрязва стринга от начален(begin) и краен(end) индекс
                System.out.println(subExpression);
            }
        }
    }
}
//1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5
//output
//(2 + 3)
//(3 + 1)
//(2 - (2 + 3) * 4 / (3 + 1))
