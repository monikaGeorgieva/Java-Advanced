import java.util.Scanner;

public class _2_Beesyy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];
        fillMatrix(matrix,scanner);

        int[] myCoordinates = findMyPosition(matrix);
        int myRow = myCoordinates[0];
        int myCol = myCoordinates[1];
        int unitsOfEnergy = 15;
        int nectarCollected = 0;
        boolean isEnergyRestored = false;
        boolean isHiveReached = false;

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if (command.isEmpty()){
                break;
            }

            int newRow = myRow;
            int newCol = myCol;

            switch (command) {
                case "up":
                    newRow = (myRow - 1 + n) % n;
                    break;
                case "down":
                    newRow = (myRow + 1) % n;
                    break;
                case "left":
                    newCol = (myCol - 1 + n) % n;
                    break;
                case "right":
                    newCol = (myCol + 1) % n;
                    break;
            }

            unitsOfEnergy--;

            if (Character.isDigit(matrix[newRow][newCol])) {
                nectarCollected += Character.getNumericValue(matrix[newRow][newCol]);
            }

            if (matrix[newRow][newCol] == 'H') {
                isHiveReached = true;
                matrix[myRow][myCol] = '-';
                myRow = newRow;
                myCol = newCol;
                matrix[myRow][myCol] = 'B';
                break;
            }

            if (matrix[newRow][newCol] != 'H') {
                matrix[newRow][newCol] = 'B';
            }
            matrix[myRow][myCol] = '-';
            myRow = newRow;
            myCol = newCol;

            if (unitsOfEnergy <= 0) {
                if (!isEnergyRestored && nectarCollected >= 30) {
                    unitsOfEnergy += nectarCollected - 30;
                    nectarCollected = 30;
                    isEnergyRestored = true;
                } else {
                    break;
                }
            }
        }
        if (isHiveReached) {
            if (nectarCollected >= 30) {
                System.out.println("Great job, Beesy! The hive is full. Energy left: " + unitsOfEnergy);
            } else {
                System.out.println("Beesy did not manage to collect enough nectar.");
            }
        } else if (unitsOfEnergy <= 0) {
            System.out.println("This is the end! Beesy ran out of energy.");
        }

        printMatrix(matrix);
    }
    private static int[] findMyPosition(char[][] matrix) {
        int[] myCoordinates = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'B') {
                    myCoordinates[0] = row;
                    myCoordinates[1] = col;
                }
            }
        }
        return myCoordinates;
    }
    private static void printMatrix(char[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
    private static void fillMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().toCharArray();
        }
    }
}
//4
//B---
//1991
//----
//---H
//down
//right
//right
//right
//down
//down
//left
