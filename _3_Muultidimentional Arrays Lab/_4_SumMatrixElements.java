import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _4_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimention = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray(); //взимам първите две числа
        int rows = dimention[0]; //3
        int cols = dimention[1]; //6

        int[][] matrix = new int [rows][cols]; //създаване на матрица

        int totalSum = 0;
        for (int row = 0; row < rows ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                totalSum += matrix[row][col];
            }
        }
    /*
        for (int[] arr: matrix ) {
            for (int e: arr) {
                totalSum += e;
            }
        }
     */
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(totalSum);

    }
}
/*
3, 6
7, 1, 3, 3, 2, 1
1, 3, 9, 8, 5, 6
4, 6, 7, 9, 1, 0
*/
//output:
//3
//6
//76
