
public class ReverseArray {

    public static void main(String args[]) {
        int numbers[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        Reverse(numbers);
    }

    public static void Reverse(int numbers[]) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int temp = 0;
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;                                                 
        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
    }

}
