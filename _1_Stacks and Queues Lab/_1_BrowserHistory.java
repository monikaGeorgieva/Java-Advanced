import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!input.equals("Home")){
            if (!input.equals("back")){
                stack.push(input);
                System.out.println(input);
            }else{
                int size = stack.size();
                if (size <= 1){
                    System.out.println("no previous URLs");
                }else {
                    stack.pop(); //премахваме текущия за да принтираме предишния
                    System.out.println(stack.peek());
                }
            }

            input = scanner.nextLine();
        }
    }
}
/*
Write a program which takes 2 types of browser instructions:
▪ Normal navigation: a URL is set, given by a string
▪ The string "back" that sets the current URL to the last set URL
*/
//https//softuni.bg/
//back
//https//softuni.bg/trainings/courses
//back
//https//softuni.bg/trainings/2056
//back
//https//softuni.bg/trainings/live
//https//softuni.bg/trainings/live/details
//Home
