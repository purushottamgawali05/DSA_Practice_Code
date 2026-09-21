
public class NQueensFinal {

    // Check weather placing the Queen here is safe or NOT
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

    public static void nQueens(char board[][], int row) {
        //base case 
        if (row == board.length) {
            print(board);
            return;
        }

        // Placing the Queen on a position 
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = 'X';
            }
        }
    }

    //print board
    public static void print(char board[][]) {
        System.out.println("---------Chess Board---------");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //filling all positions of the board with x
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = 'X';
            }
        }

        //calling function
        nQueens(board, 0);
    }
}
