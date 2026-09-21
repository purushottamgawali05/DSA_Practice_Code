
public class Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //column wise
        for (int idx = 0; idx < sudoku[0].length; idx++) {
            if (sudoku[idx][col] == digit) {
                return false;
            }
        }

        //row-wise
        for (int idx = 0; idx < sudoku.length; idx++) {
            if (sudoku[row][idx] == digit) {
                return false;
            }
        }

        //Grid-Wise
        //finding starting row and col
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        //check whether a digit exists int that grid or not
        for (int r = sr; r < sr + 3; r++) {
            for (int c = sc; c < sc + 3; c++) {
                if (sudoku[r][c] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        //base case
        if (row == 9) {
            return true;
        }

        //recursion
        //When the column reaches the end, shift to the next row and start from the first column of the row.
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        //if the number is not zero
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        //place the digit at a particular position
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int sudoku[][]) {
        for (int row = 0; row < sudoku.length; row++) {
            for (int col = 0; col < sudoku[0].length; col++) {
                System.out.print(sudoku[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3},};
        int row = 0;
        int col = 0;

        print(sudoku);

        if (sudokuSolver(sudoku, row, col)) {
            System.out.println("============Solution Exists==================");
            print(sudoku);
        } else {
            System.out.println("=============Solution Does Not Exists============");
        }
    }
}
