
public class OptimizedGridWays {

    public static int fact(int num) {
        int f = 1;
        for (int idx = 1; idx <= num; idx++) {
            f *= idx;
        }
        return f;
    }

    public static void main(String args[]) {
        int rows = 4, cols = 4;
        int totalCharsPermutation = fact(rows + cols - 2);
        int firstRepeatingCharsPermutation = fact(rows - 1);
        int secondRepeatingCharsPermutation = fact(cols - 1);

        int totalWays = totalCharsPermutation / (firstRepeatingCharsPermutation * secondRepeatingCharsPermutation);

        System.out.println(totalWays);
    }
}
