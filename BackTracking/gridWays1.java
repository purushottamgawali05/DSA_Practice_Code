
public class gridWays1 {

    public static int findGridWays(int rows, int cols, int row, int col) {
        if (row == rows - 1 && col == cols - 1) {
            return 1;
        } else if (row == rows || col == cols) {
            return 0;
        }
        int ways1 = findGridWays(rows, cols, row + 1, col);
        int ways2 = findGridWays(rows, cols, row, col + 1);
        return ways1 + ways2;
    }

    public static void main(String args[]) {
        int rows = 3 , cols = 4;
        int row = 0;
        int col = 0;
        System.out.println(findGridWays(rows, cols, row, col));

    }
}
