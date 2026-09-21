
public class ArrayPairs {

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        PairsOfArray(numbers);
    }

    public static void PairsOfArray(int numbers[]) {

        int totalpair = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                totalpair++;
            }
            System.out.println();
        }
        System.err.println("Total number of pairs: " + totalpair);
    }

}
