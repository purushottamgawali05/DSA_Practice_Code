
// public class Day9 {
//     public static void BruteForce(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 currSum = 0;
//                 for (int k = i; k <= j; k++) {
//                     currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("The maxsum is: " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {1, 2, 3, 4, 50, 100};
//         BruteForce(numbers);
//     }
// }
public class Day9 {

    public int maxSubArrSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                // System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        // System.out.println("The max SubArray sum is: " + maxSum);
        return maxSum;
    }

    public static void main(String max[]) {

        Day9 day = new Day9();

        int arr[] = {2, 4, 6, 8, 10};
        System.out.println(day.maxSubArrSum(arr));

    }
}

//Time Complexity = O(n^3)
//Space Complexity = O(1)
