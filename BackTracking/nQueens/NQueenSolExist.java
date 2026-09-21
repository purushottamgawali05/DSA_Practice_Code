
public class NQueenSolExist {

    public static boolean isSafe(char board[][], int row, int col) {
        //vertical check
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }

        //up left 
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //up right
        for (int r = row - 1, c = col + 1; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        //base case 
        if (row == board.length) {
            // print(board);
            // count++;
            return true;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = 'X';
            }
        }

        return false;
    }

    public static void print(char board[][]) {
        System.out.println("---------Chess Board---------");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    // static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = 'X';
            }
        }

        if (nQueens(board, 0)) {
            System.out.println("Solution Exists: ");
            print(board);
        } else {
            System.out.println("Solution Does Not Exist");
        }

    }
}
