//Hi, I Am Purushottam
/*
public class FirstLetterUpperCase {
    
public static String UpperCaseFunc(String str) {
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for (int i = 1; i < str.length(); i++) {
            
        if (str.charAt(i) == ' ' && i < str.length() - 1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));

        } else {
            
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

public static void main(String Letter[]) {
    
String str = "hi, i am purushottam";
System.out.println(UpperCaseFunc(str));
}
}
 */

//-----------------------------------------------------------------------------------------------------------
//a3b2c3d2
/*
public class FirstLetterUpperCase {
    
public static String LetterCompress(String str) {
    
String NewStr = "";

for (int i = 0; i < str.length(); i++) {
    
Integer count = 1;

while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    count++;
    i++;
}
NewStr += str.charAt(i);
if (count > 1) {
    NewStr += count.toString();
}
}
return NewStr;
}

public static void main(String Compress[]) {
    
String str = "aaabbcccdd";
System.out.println(LetterCompress(str));
}
}
 */
public class FirstLetterUpperCase {

    public static String LetterCompress(String str) {

        StringBuilder NewStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            NewStr.append(str.charAt(i));
            if (count > 1) {
                NewStr.append(count.toString());
            }
        }
        return NewStr.toString();
    }

    public static void main(String Compress[]) {

        String str = "aaabccdd";
        System.out.println(LetterCompress(str));
    }
}
//a3bc2d2