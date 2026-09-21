/*
 
public class SearchSorted2DArray {

    public static boolean SearchSort(int matrix[][], int key) {

        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){

            if(key == matrix[row][col]){
                System.out.println("The key found at "+ row +"," + col);
                return  true;
            }
            else if( key  <  matrix[row][col] ){
                col--;
            }else{
                row++;
            }
        }

        System.out.println("The Key Doesn't Found");
        return false;
    }

    public static void main(String[] Search) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},};

        int key = 11;

        SearchSort(matrix, key);

    }
}

Output:
The key found at 2,2
 */

public class SearchSorted2DArray {

    public static boolean SearchSort(int matrix[][], int key) {

        int row = matrix.length - 1, col = 0;

        while (col < matrix.length && row >= 0) {

            if (key == matrix[row][col]) {
                System.out.println("The key found at " + row + "," + col);
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }

        System.out.println("The Key Doesn't Found");
        return false;
    }

    public static void main(String[] Search) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},};

        int key = 2;

        SearchSort(matrix, key);

    }
}

// Output:
// The key found at 2,2
