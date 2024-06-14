import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> uniqueChemicalEl = new TreeSet<>();
        for (int i = 0; i < n ; i++) {

            String compound = scanner.nextLine();
            String [] element = compound.split(" ");
            uniqueChemicalEl.addAll(Arrays.asList(element));
        }
        uniqueChemicalEl.forEach(el -> System.out.print(el + " "));
    }
}
//4
//Ce O
//Mo O Ce
//Ee
//Mo
//output:
//Ce Ee Mo O
