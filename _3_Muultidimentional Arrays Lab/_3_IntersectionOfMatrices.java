import java.util.Scanner;

public class _3_IntersectionOfMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine()); //3 реда
        int cols = Integer.parseInt(scanner.nextLine()); //4 елемента

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            //попълни първата матрица
            String line = scanner.nextLine().replaceAll(" ","");
           firstMatrix[row] = line.toCharArray();
        }
        for (int row = 0; row < rows; row++) {
            //попълни втората матрица
            String line = scanner.nextLine().replaceAll(" ","");
            secondMatrix[row] = line.toCharArray();
        }

        for (int row = 0; row < rows; row++) {
            //print the current row in the matrix -текущ ред
            for (int c = 0; c < cols; c++) {
                char outputSymbol = '*';
                if (firstMatrix[row][c] == secondMatrix[row][c]){
                    //ако елемента на текущата ред и колона на 1вата матрица
                    //съвпада със елемента на втора матрица го замени с *
                    outputSymbol = firstMatrix[row][c];
                }
                System.out.print(outputSymbol + " ");
            }
            System.out.println();
        }
    }
}
/*
3
4
a b c d
a b c d
a b c d
k b c k
a b g d
a k c d
output:
* b c *
a b * d
a * c d
*/
