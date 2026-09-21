
import java.util.*;

public class Palindrome {

    public static boolean PalindromeCheck(String s){
        int len = s.length();

        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len - 1 -i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();//One Word
        String s1 = sc.nextLine();//sentence

        System.out.println(PalindromeCheck(s));
        System.out.println(PalindromeCheck(s1));

    }
}

