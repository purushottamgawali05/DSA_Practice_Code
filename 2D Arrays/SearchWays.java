
public class SearchWays {

    //brute force approach to search a matrix -> O(rows * cols)
    public boolean bruteForce(int matrix[][], int key, int n, int m) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    //binary to find the exact row then linear search on that row -> O(log(rows) + cols)
    public boolean binaryLinear(int matrix[][], int key, int n, int m) {

        int start = 0, end = n - 1, col = 0, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[mid][col] == key) {
                return true;
            } else if (matrix[mid][col] < key) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[ans][j] == key) {
                return true;
            }
        }

        return false;
    }

    //first find exact row by binary search and apply again binary search on that row -> O(log(rows) + log(cols))
    public boolean binaryBinary(int matrix[][], int key, int n, int m) {
        int start = 0, end = n - 1, col = 0, row = 0;

        //binary search to find row
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[mid][col] == key) {
                return true;
            } else if (matrix[mid][col] < key) {
                row = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        //binary search to find column
        int left = 0, right = m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (matrix[row][mid] == key) {
                return true;
            } else if (matrix[row][mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public boolean stairCase(int matrix[][], int key, int n, int m) {

        //staircase approach -> left-bottom
        // int row = n-1, col = 0;
        // while(row >= 0 && col < m){
        //     if(matrix[row][col] == key){
        //         System.out.println("row: " + row + "," + "col: " + col);
        //         return true;
        //     }else if(matrix[row][col] > key){
        //         row--;
        //     }else{
        //         col++;
        //     }
        // }
        // return false;
        //top-right
        int row = 0, col = m - 1;
        while (row < n && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("row: " + row + "," + "col: " + col);
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public boolean assumeOneDArray(int matrix[][], int key, int n, int m) {
        //1 3 5 7 10 11 16 20 14 23 30 34 60
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == key) {
                System.out.println("row: " + row + "," + "col: " + col);
                return true;
            } else if (key < matrix[row][col]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        SearchWays sw = new SearchWays();

        int matrix[][] = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int key = 10;
        int n = matrix.length, m = matrix[0].length;

        // System.out.println(sw.bruteForce(matrix, key, n, m));
        // System.out.println(sw.binaryLinear(matrix, key, n, m));
        // System.out.println(sw.binaryBinary(matrix, key, n, m));
        // System.out.println(sw.stairCase(matrix, key, n, m));
        System.out.println(sw.assumeOneDArray(matrix, key, n, m));
    }
}
