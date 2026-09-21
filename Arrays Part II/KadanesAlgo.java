
// public class KadanesAlgo {
//     public static void kadanes(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int largestNum = Integer.MIN_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] > largestNum) {
//                 largestNum = numbers[i];
//             }
//         }
//         System.out.println(largestNum);
//         for (int i = 0; i < numbers.length; i++) {
//             currSum += numbers[i];
//             if (currSum < 0) {
//                 currSum = 0;
//             }
//             maxSum = Math.max(currSum, maxSum);
//         }
//         System.out.println("The max sum is: " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {-2, -5, -8, -6, -3};
//         kadanes(numbers);
//     }
// }
// "static void main" must be defined in a public class.
public class KadanesAlgo {

    public int kadanes(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int num : arr) {
            largest = Math.max(largest, num);
        }

        if (largest < 0) {
            return largest;
        }

        for (int num : arr) {
            currSum += num;
            System.out.println(currSum);
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        KadanesAlgo m = new KadanesAlgo();

        int arr[] = {-2, 3, -4};
        // System.out.println("The maxSum is: " + m.maxSum(arr));
        // System.out.println("The maxSum is: " + m.prefixSum(arr));
        System.out.println("The maxSum is: " + m.kadanes(arr));
    }
}
