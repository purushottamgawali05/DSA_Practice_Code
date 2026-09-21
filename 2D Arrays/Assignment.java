// "static void main" must be defined in a public class.

public class Assignment {

//     public boolean searchSorted(int matrix[][], int key){
//       //right-top to left-bottom
// //       int n = matrix.length - 1;
// //       int row = 0, col = matrix[0].length- 1;
// //       while(row <= n && col >= 0){
// //         if(matrix[row][col] == key){
// //           System.out.println("The key is at: " + "(" + row + ","+ col +")");
// //           return true;
// //       }else if(key < matrix[row][col]){
// //             col--;
// //       }else{
// //             row++;
// //        }
// //       }
// //        return false;


//   // left-bottom to right-top
//     int row = matrix.length - 1, col = 0;
//     while(row >= 0 && col < matrix[0].length){
//       if(matrix[row][col] == key){
//         System.out.println("Key found at: " + "(" + row + "," + col + ")");
//         return true;
//       }else if(key < matrix[row][col]){
//           row--;
//       }else{
//         col++;
//       }
//        }
//          System.out.println("The key do not found");
//       return false;
//     }  


    public int count(int arr[][]) {

        int countNum = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == 7) {
                    countNum++;
                }
            }
        }
        return countNum;
    }

    public int secondRowSum(int nums[][]) {

        int sum = 0, row = 1;

        for (int col = 0; col < nums.length; col++) {
            sum += nums[row][col];
        }
        return sum;
    }

    public void transpose(int nums[][]) {

        int transposeMat[][] = new int[nums[0].length][nums.length];

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                transposeMat[col][row] = nums[row][col];
            }
        }

        for (int row = 0; row < transposeMat.length; row++) {
            for (int col = 0; col < transposeMat[0].length; col++) {
                System.out.print(transposeMat[row][col] + " ");
            }
            System.out.println();
        }

    }

    // public void print(int nums[][]){
    //   for(int row = 0; row < arr.length; row++){
    //     for(int col = 0; col < nums[0].length; col++){
    //       System.out.print(nums[row][col] + " ");
    //     }
    //     System.out.println();
    //   }
    // }
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Assignment m = new Assignment();

//           int matrix[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16},};
//         int key = 0;
        // int[][] arr = { {4,7,8},{8,8,7} };
        // System.out.println(m.count(arr));
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // System.out.println(m.secondRowSum(nums));
        int[][] nums = {{11, 12, 13}, {21, 22, 23}};
        m.transpose(nums);
        // m.print(nums);

        // System.out.println(m.searchSorted(matrix, key));
    }
}
