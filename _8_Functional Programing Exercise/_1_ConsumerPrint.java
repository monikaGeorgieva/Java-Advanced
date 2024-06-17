import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _1_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\+s"))
                .collect(Collectors.toList());

        // //Consumer: аргумент -> извършва се действие без да връща резултат
        Consumer<String> consume = name -> System.out.println(name);
        names.forEach(consume);
        names.forEach(name -> System.out.println(name));


    }
}
