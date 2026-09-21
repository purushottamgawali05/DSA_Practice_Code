
import java.util.Scanner;

public class RegexProb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ip = sc.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {

    String reg = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    public String pattern = reg + "." + reg + "." + reg + "." + reg;
}
