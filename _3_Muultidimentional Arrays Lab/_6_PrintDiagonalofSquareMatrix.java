import java.util.Arrays;
import java.util.Scanner;

public class _6_PrintDiagonalofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = readMatrix(scanner);

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int lastRowIndex = matrix.length  - 1;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[ lastRowIndex - i][i] + " ");
        }
    }
    private static  int[][] readMatrix(Scanner scanner){
       int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int [size][size];
        for (int r = 0; r < size; r++) {
            matrix[r] = readArray(scanner);
        }
        return  matrix;
    }
    private static  int[] readArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
//3
//1 2 3
//1 2 3
//1 2 3
//output: диагонал
//1 2 3
//1 2 3

//4
//1 2 3 2
//1 1 2 4
//1 2 1 4
//2 2 3 1
//output:
//1 1 1 1
//2 2 2 2
