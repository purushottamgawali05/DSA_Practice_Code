
import java.util.Scanner;

public class TwoDA1 {

    public static boolean Search(int matrix[][], int key, int n, int m) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == 5) {
                    System.out.println("The key has found: " + "(" + row + ", " + col + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static int Minimum(int matrix[][], int key, int n, int m, int min) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
        }
        System.out.println("The minimum number has found: " + min);
        return min;
    }

    public static void main(String puru[]) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int n = matrix.length;// no. of rows
        int m = matrix[0].length; // no. of cols

        System.out.println("Enter your array: ");

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Your array is: ");

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("The Array has ended");

        Search(matrix, 5, n, m);

        int min = Integer.MAX_VALUE;
        Minimum(matrix, 5, n, m, min);

    }
}
