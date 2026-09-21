
public class SpiralMatrix {

    public static void SpiralM(int matrix[][]) {

        int StartRow = 0;
        int EndRow = matrix.length - 1;
        int StartCol = 0;
        int EndCol = matrix[0].length - 1;

        while (StartRow <= EndRow && StartCol <= EndCol) {

            //top
            for (int col = StartCol; col <= EndCol; col++) {
                System.out.print(matrix[StartRow][col] + " -> ");
            }

            //right
            for (int row = StartRow + 1; row <= EndRow; row++) {
                System.out.print(matrix[row][EndCol] + " -> ");
            }

            //bottom
            for (int col = EndCol - 1; col >= StartCol; col--) {
                if (StartRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndCol][col] + " -> ");
            }

            //left
            for (int row = EndRow - 1; row >= StartRow + 1; row--) {
                if (StartCol == EndCol) {
                    break;
                }
                System.out.print(matrix[row][StartCol] + " -> ");

            }

            StartRow++;
            StartCol++;
            EndCol--;
            EndRow--;

        }
        System.out.println();
    }

    public static void main(String Spiral[]) {

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        SpiralM(matrix);
    }
}
