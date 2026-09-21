
public class Subarray {

    public static void main(String args[]) {
        int numbers[] = {2, 4};
        PairsOfSubArray(numbers);
    }

    public static void PairsOfSubArray(int numbers[]) {

        int totalSA = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }

                if (minSum > sum) {
                    minSum = sum;
                }

                totalSA++;
                System.out.println();
            }
            System.out.println();

        }
        System.err.println("Total number of subArrays: " + totalSA);
        System.out.println("The maxSum is: " + maxSum);
        System.out.println("The minSum is: " + minSum);
    }

}
