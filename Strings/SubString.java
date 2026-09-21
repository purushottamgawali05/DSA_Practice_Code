
import java.util.Scanner;

public class SubString {

    public static String substringfind(String s, int startidx, int endidx) {
        String gotsubstring = "";

        // for (int i = startidx; i < endidx; i++) {
        //     gotsubstring += s.charAt(i);
        // }
        gotsubstring = s.substring(startidx, endidx);
        return gotsubstring;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String s = sc.next();
        int startidx = sc.nextInt();
        int endidx = sc.nextInt();

        System.out.println(substringfind(s, startidx, endidx));

    }
}
