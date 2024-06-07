import java.util.Arrays;
import java.util.Scanner;

public class _2_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] dimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimentions[0];
        int cols = dimentions[1];

        int [][] matrix = new int [rows][cols];

        for (int rowsMatrix = 0; rowsMatrix < rows ; rowsMatrix++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int columnsMatrix = 0; columnsMatrix < cols ; columnsMatrix++) {

                matrix[rowsMatrix][columnsMatrix] = arr[columnsMatrix];
            }
        }
        boolean isFound = false;
        int specialValue = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                int currentElement = matrix[row][col];
                if (currentElement == specialValue){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
/*
2 3
1 2 3
4 2 2
2
output:
0 1
1 1
1 2
*/
