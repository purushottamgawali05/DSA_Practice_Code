/*
public class Practice {
    
public static int LowerCaseVowel(String s) {
    int count = 0;
    
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            count++;
        }
    }
    return count;
}

public static void main(String[] Lower) {
    
String s = "Purushottam";
System.out.println("The number of vowels are: " + LowerCaseVowel(s));
}
}
 */
//The number of vowels are: 4
//---------------------------------------------------------------------------------------------
/*
public class Practice {
    
public static void main(String[] args) {

String str = "ShradhaDidi";
String str1 = "ApnaCollege";
String str2 = "ShradhaDidi";

System.out.println(str.equals(str1) + " " + str.equals(str2));
}
}
 */
//false true
//---------------------------------------------------------------------------------------------
/*
public class Practice {
    
public static void main(String[] args) {
    String str = "ApnaCollege".replace("l", "");
    System.out.println(str);
    }
}
 */
//ApnaCoege
//---------------------------------------------------------------------------------------------


/*
Question 4 :Determine if 2 Strings areanagramsof each other.What are anagrams?Iftwostringscontainthesamecharactersbutinadifferentorder,theycanbesaidtobeanagrams.Considerraceandcare.Inthiscase,race'scharacterscanbeformedintoastudy,orcare'scharacterscanbeformedintorace.Belowisajavaprogramtocheckiftwostringsare anagrams or not
 */
import java.util.Arrays;

public class Practice {

    public static boolean Anagrams(String str1, String str2) {
        boolean result = true;

        if (str1.length() != str2.length()) {
            result = false;
        }

        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);
        String sortedStr1 = new String(chars1);

        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        String sortedStr2 = new String(chars2);

        if (sortedStr1.equals(sortedStr2)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        String str1 = "race43";
        String str2 = "carer";
        System.out.println(Anagrams(str1, str2));
    }
}
