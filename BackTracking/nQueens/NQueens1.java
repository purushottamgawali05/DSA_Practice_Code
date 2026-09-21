public class NQueens1 {
  public static void nQueens(char board[][], int row){
    //base case 
    if(row == board.length){
      print(board);
      return;
    }

    for(int col = 0; col < board.length; col++){
        board[row][col] = 'Q';
        nQueens(board, row+1);
        board[row][col] = 'X';
    }
  }

  public static void print(char board[][]){
    System.out.println("---------Chess Board---------");
    for(int row = 0; row < board.length; row++){
      for(int col = 0; col < board[0].length; col++){
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n = 2;
    char board[][] = new char[n][n]; 

    for(int row = 0; row < n; row++){
      for(int col = 0; col < n; col++){
        board[row][col] = 'X';
      }
    }

    nQueens(board, 0);
  }
}
