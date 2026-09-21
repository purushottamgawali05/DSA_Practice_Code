
import java.util.*;

public class Token1 {

    public static void Token1(String s) {
        int count = 0;
        String arr[] = s.split("[!, ?.'_@]+");

        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == " " || ',' || '?' || '.' || '_' || '!' || '@' ){
        //         count++;
        //     }
        // }
        for (String i : arr) {
            count++;
            System.out.println(i);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        Token1(s);
    }
}
