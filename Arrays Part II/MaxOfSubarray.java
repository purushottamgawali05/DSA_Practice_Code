
// public class MaxOfSubarray {
//     public static void PrefixSum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//         prefix[0] = numbers[0];
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Tha max sum is: " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, -4, -12};
//         PrefixSum(numbers);
//     }
// }
public class MaxOfSubarray {

    public int maxSubArr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;// -ve infinite
        int currSum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int pf = 1; pf < arr.length; pf++) {
            prefix[pf] = prefix[pf - 1] + arr[pf];
        }

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                currSum = start == 0 ? prefix[start] : prefix[end] - prefix[start - 1];
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String max[]) {

        MaxOfSubarray max1 = new MaxOfSubarray();
        int arr[] = {2, -4, -12};

        System.out.println(max1.maxSubArr(arr));

    }
}
