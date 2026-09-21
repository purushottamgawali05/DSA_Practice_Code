// "static void main" must be defined in a public class.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);

        //2D array creation
        int matrix[][] = new int[3][3];
        int key = 5;

        //input
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        //print
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        //search
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == key) {
                    System.out.println("The key found at: " + row + "," + col);
                }

                largest = Math.max(largest, matrix[row][col]);
                smallest = Math.min(smallest, matrix[row][col]);
            }
        }
        System.out.println("The largest element is: " + largest);
        System.out.print("The smallest element is: " + smallest);

    }
}
