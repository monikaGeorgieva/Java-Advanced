import java.util.Arrays;
import java.util.Scanner;

public class _5_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] dimention = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray(); //взимам първите две числа
        int rows = dimention[0]; //3
        int cols = dimention[1]; //6

        int[][] matrix = new int [rows][cols]; //създаване на матрица

        //прочитаме числата от входните данни
        for (int row = 0; row < rows ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int [][] maxSubMatrix = new int[2][2];

        int finalSum = Integer.MIN_VALUE;
        //минава през числата по матрицата
        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length  - 1; c++) {
                    int currentElement = matrix[r][c];
                    int right = matrix[r][c + 1];
                    int below = matrix[r + 1][c];
                    int rightBelow = matrix [r + 1][c + 1];

                    int sum = currentElement  + right + below + rightBelow;
                    if (finalSum < sum){
                        finalSum = sum;
                        maxSubMatrix[0][0] = currentElement;
                        maxSubMatrix[0][1] = right;
                        maxSubMatrix[1][0] = below;
                        maxSubMatrix[1][1] = rightBelow;
                    }
            }
        }
        System.out.println(maxSubMatrix[0][0] + " " + maxSubMatrix [0][1]);
        System.out.println(maxSubMatrix[1][0] + " " + maxSubMatrix[1][1]);
        System.out.println(finalSum);
    }
}
/*
3, 6
7, 1, 3, 3, 2, 1
1, 3, 9, 8, 5, 6
4, 6, 7, 9, 1, 0
output:
9 8
7 9
33
*/
