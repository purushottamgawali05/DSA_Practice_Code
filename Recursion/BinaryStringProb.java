
import java.util.Scanner;

public class BinaryStringProb {

    public static void BinaryString(int N, int lastplace, String str) {
        if (N == 0) {
            System.out.println(str);
            return;
        }

        BinaryString(N - 1, 0, str + "0");

        if (lastplace == 0) {
            BinaryString(N - 1, 1, str + "1");
        }
    }

    public static void main(String[] binary) {

        Scanner sc = new Scanner(System.in);
        //size of string 
        System.out.println("Enter size of a string: ");
        int N = sc.nextInt();

        //lastplace
        int lastplace = 0;

        //empty string
        String str = "";
        BinaryString(N, lastplace, str);
    }
}
