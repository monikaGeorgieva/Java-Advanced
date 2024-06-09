import java.util.Scanner;

public class _2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];
        //1.Метод който попълва матрицата на палиндрома
        fillMatrix(matrix);
        //2.Метод който отпечатва матрицата
        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix) {
        int asciiValueA = 97;

        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                //1ва и последна буква = 97 + ред
                char firstLetter = (char) (asciiValueA + row);
                char middleLetter = (char) (asciiValueA + row + col);
                char  lastLeter = (char) (asciiValueA + row);
                // //97 + 0 = 97 --> а
                // 97 + 0 + 0 = 97 --> a
                // 97 + 0 = 97 --> a
                String palindrome = String.format("%c%c%c",firstLetter,middleLetter,lastLeter);
                matrix[row][col] = palindrome;
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
