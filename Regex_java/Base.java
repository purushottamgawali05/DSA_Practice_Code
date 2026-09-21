
import java.util.Scanner;
import java.util.regex.*;

public class Base {

    public static void main(String base[]) {

        //Regex Quntifiers
        System.out.println("? quantifiers: ");
        System.out.println(Pattern.matches("[abc]?", "a"));//true
        System.out.println(Pattern.matches("[ayz]?", "aaa"));//false
        System.out.println(Pattern.matches("[ayz]?", "ayyyzz"));//false
        System.out.println(Pattern.matches("[ayz]?", "amtrn"));//false
        System.out.println(Pattern.matches("[ayz]?", "ayz"));//true

        System.out.println("+ quantifiers: ");
        System.out.println(Pattern.matches("[abc]+", "a"));//true
        System.out.println(Pattern.matches("[ayz]+", "aaa"));//true
        System.out.println(Pattern.matches("[ayz]+", "ayyyzz"));//true
        System.out.println(Pattern.matches("[ayz]+", "amtrn"));//false

        System.out.println("* quantifiers: ");
        System.out.println(Pattern.matches("[ayz]*", "ayyyzz"));//true

        //check regex pattern
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {

                System.out.println("Enter the pattern: ");
                String regexPattern = sc.nextLine();
                Pattern pattern = Pattern.compile(regexPattern);
                Matcher matcher = pattern.matcher("Welcome to my world");
                boolean found = false;
                while (matcher.find()) {
                    System.out.println("Found the text " + matcher.group() + "Starting at index " + matcher.start() + " and Ending at index " + matcher.end());
                    found = true;
                }

                if (!found) {
                    System.out.println("Match not found");
                }

                System.out.println("Enter 0 to continue and 1 to exit ");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice != 0) {
                    break;
                }
            }
        }
    }
}
