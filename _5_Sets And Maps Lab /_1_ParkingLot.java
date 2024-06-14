import java.util.IllegalFormatCodePointException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>(); //уникалните номера
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("END")){
            String registration = input.substring(input.lastIndexOf(" ")).trim();
            //последното място на което има space -> lastIndexOf(str:" ");
            if (input.contains("IN")){
                parkingLot.add(registration);
            }else {
                parkingLot.remove(registration);
            }
            input = scanner.nextLine();
        }
        String output = parkingLot.isEmpty()
                ? "Parking Lot is Empty"
                :String.join(System.lineSeparator(),parkingLot);
        System.out.println(output);
//        for (String str : parkingLot) {
//            System.out.println(str);
//        }
    }
}
//IN, CA2844AA
//IN, CA1234TA
//OUT, CA2844AA
//IN, CA9999TT
//IN, CA2866HI
//OUT, CA1234TA
//IN, CA2844AA
//OUT, CA2866HI
//IN, CA9876HH
//IN, CA2822UU
//END
