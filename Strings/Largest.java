
import java.util.Scanner;

public class Largest {

    public static String LargeString(String arr[]) {
        String largestring = arr[0];

        for (int i = 0; i < arr.length; i++) {
            
            if (largestring.compareToIgnoreCase(arr[i]) < 0) {
                largestring = arr[i];

            }
        }
        return largestring;
    }

    public static void main(String large[]) {

        Scanner sc = new Scanner(System.in);

        String arr[] = {"Banana", "zpple", "chikoo", "aomegranate"};

        System.out.println(LargeString(arr));
    }
}
