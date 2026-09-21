
import java.util.*;

public class SumOfDiagonal {

    public static int Diagonal(int matrix[][]) {

        int sum = 0;
        // int sum2 = 0;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum1 += matrix[i][j];

        //         } 
        //         else if (i + j == matrix.length - 1) {
        //             sum2 += matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum1);
        for (int i = 0; i < matrix.length; i++) {

            //primary diagonal
            sum += matrix[i][i];

            //secondary diagonal
            if (i != matrix.length - 1 - i) {

                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        return sum;
    }

    public static void main(String Sum[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = scanner.nextInt();

        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Diagonal(matrix));
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        scanner.close();
    }
}
