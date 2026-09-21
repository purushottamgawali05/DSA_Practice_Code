
import java.util.Arrays;
import java.util.Collections;

public class Inbuilt {

    public static void Print(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = {115, 31, 66, 9, 8};
        // Arrays.sort(arr);
        // Print(arr);

        // Arrays.sort(arr, 0, 2);
        // Print(arr);
        
        // Arrays.sort(arr, Collections.reverseOrder());
        // Print(arr);
        Arrays.sort(arr, 1, 3, Collections.reverseOrder());
        Print(arr);

    }
}
