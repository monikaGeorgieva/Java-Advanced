import java.util.Arrays;
import java.util.Scanner;

public class _1_CompareMatrices {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int[][] firstMatrix = readMatrix(scanner);
     int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = firstMatrix.length == secondMatrix.length;
        //if lenght is equal
        if (areEqual){
            for (int r = 0; r < firstMatrix.length ; r++) {
                int[] firstArr = firstMatrix[r]; //първи масив
                int[] secondArr = secondMatrix[r]; //втори масив

                areEqual = firstArr.length == secondArr.length;

                if (areEqual){ // if it's true then
                    for (int i = 0; i < firstArr.length ; i++) {
                        if (firstArr[i] != secondArr[i]){
                            //провери и елементите дали са еднакви
                            areEqual = false;

                        }
                    }
                }
            }

        }
        String output;
        if (areEqual){
            output = "equal";
        }else {
            output = "not equal";
        }
        System.out.println(output);
    }

    private static int[][] readMatrix(Scanner scanner){
        int [] matrixSize = readArray(scanner);
        int rows= matrixSize[0];
        int cols = matrixSize[1];

        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows ; i++) { //rows
            int [] arr = readArray(scanner);
            matrix[i] = arr; //1 2 3
            //2 1 3
        }
       return matrix;
    }
    private static int[] readArray(Scanner scanner) {
        int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
/*
2 3
1 2 3
2 1 3
2 3
1 2 3
2 1 3
output:
equal
*/
