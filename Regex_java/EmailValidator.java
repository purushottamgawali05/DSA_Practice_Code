
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {

        String regex = "^[A-Za-z0-9-\\+]+[\\.[_A-Za-z0-9-]+]*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.nextLine();

        if (Pattern.matches(regex, email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

    }
}
