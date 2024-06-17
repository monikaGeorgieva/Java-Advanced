import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _2_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).toList();
        names.forEach(name -> System.out.println("Sir " + name));
    }
}
//Peter George Alex Stan
//Sir Peter
//Sir George
//Sir Alex
//Sir Stan
