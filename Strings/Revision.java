
import java.util.Scanner;

public class Revision {

    public boolean palindrome(String str1) {

        int i = 0;
        while (i < str1.length()) {
            if (str1.charAt(i) != str1.charAt(str1.length() - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public float distance(String str1) {
        float shortPath = 0, x = 0, y = 0;
        int i = 0;
        while (i < str1.length()) {
            char ch = str1.charAt(i);
            switch (ch) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    System.out.println("Not valid");
            }
            i++;
        }

        x = x * x;
        y = y * y;
        shortPath = (float) Math.sqrt(x + y);
        return shortPath;
    }

    public String findSubString(String str1) {
        String foundString = "";

        int i = 0;
        while (i < 5) {
            foundString += str1.charAt(i);
            i++;
        }

        System.out.println(str1.substring(0, 6));
        return foundString;
    }

    public int compareStr(String str1, String str2) {
        // return str1.compareTo(str2);
        return str1.compareToIgnoreCase(str2);
    }

    public char largeChar(String str1) {
        char largest = str1.charAt(0);
        int i = 1;
        while (i < str1.length()) {
            if (largest < str1.charAt(i)) {
                largest = str1.charAt(i);
            }
            i++;
        }
        return largest;
    }

    public String addWithStringBuilder(String str1) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < str1.length()) {
            sb.append(str1.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public String firstCap(String str2) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str2.charAt(0));
        sb.append(ch);
        int i = 1;
        while (i < str2.length()) {
            if (str2.charAt(i) == ' ') {
                sb.append(str2.charAt(i));
                i++;
                if (i < str2.length()) {
                    sb.append(Character.toUpperCase(str2.charAt(i)));
                }
            } else {
                sb.append(str2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public String compress(String str2) {
        if (str2 == null || str2.isEmpty()) {
            return str2;
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str2.length()) {
            char current = str2.charAt(i);
            int count = 1;
            while (i + 1 < str2.length() && str2.charAt(i + 1) == current) {
                count++;
                i++;
            }
            sb.append(current);
            if (count > 1) {
                sb.append(count);
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String str1 = sc.next();
        // String str2 = sc.next();
        String str2 = null;

        Revision RV = new Revision();
        // System.out.println("Hello");

        // System.out.println(RV.palindrome(str1));
        // System.out.println(RV.distance(str1));
        // System.out.println(RV.findSubString(str1));
        // System.out.println(RV.compareStr(str1, str2));
        // System.out.println(RV.largeChar(str1));
        // System.out.println(RV.addWithStringBuilder(str1));
        // System.out.println(str1);
        System.out.println(str2);
        // System.out.println(str1.equals(str2));
        // System.out.println(str1 == str2);
        // System.out.println(str1.substring(1, 5));

        // Integer n = 10;
        // System.out.println(Integer.toString(n));
        // System.out.println(RV.firstCap(str2));
        System.out.println(RV.compress(str2));

    }
}
