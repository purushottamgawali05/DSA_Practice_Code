/*
Question 1 :Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2
public class Practice {
    
private static int Repeat(int[][] num, int key) {
    int count = 0;
    
    for(int row =0; row<num.length; row++){
        for(int col = 0; col < num.length; col++){
            if(key == num[row][col]){
                count++;
            }
        }
    }
    return count;
}

public static void main(String[] args) {
    
        int num[][] = {
            {4, 7, 7},
            {8, 8, 9},
            {9, 9, 10},};
            
            int key = 7;
            System.out.println(Repeat(num, key));
        }
        
    }
    
 */
//------------------------------------------------------------------
/*
public class Practice {
    
public static int Sum(int num[][]) {
    int sum = 0;
    
    for (int col = 0; col < num.length; col++) {
        sum += num[1][col];
    }
    return sum;
}

public static void main(String[] args) {
    int[][] num = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
    System.out.println("The sum of the second row is: " + Sum(num));
}
}

 */
//------------------------------------------------------------------
/*
//Transpose of a matrix
public class Practice {

    public static void print(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int row = 2, col = 3;
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};
        print(matrix);
        
        int transpose[][] = new int[col][row];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        print(transpose);
    }
}
*/
//------------------------------------------------------------------

public class Solution {
    
    public static void SmallLargeString(String s,int k){
        
        String small = s, large = "", temp;
        int len = s.length();
        
        for(int i = 0; i < len-3; len++){
            temp = s.substring(0, i += 3);
            int result = small.compareTo(temp);
            
            if(result > 0 && result != 0){
                small = temp;
            }else{
                large = temp;
            }
    }
       System.out.println(small);
       System.out.println(large);
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Scanner sc = new Scanner(System.in);
        String s = "welcometojava";
        int k = 3;
        
        SmallLargeString(s, k);
        
    }
} 
//------------------------------------------------------------------
