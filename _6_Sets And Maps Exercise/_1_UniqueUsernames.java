import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _1_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> newSet = new LinkedHashSet<>();
        for (int i = 0; i < n ; i++) {
            String text = scanner.nextLine();
            newSet.add(text);
        }
/*
        for (String text: newSet) {
            System.out.println(text);
        }
*/
        newSet.forEach(word -> System.out.println(word));
    }
}
//3
//Monika
//Monika
//Paco
//Monika
//Paco
