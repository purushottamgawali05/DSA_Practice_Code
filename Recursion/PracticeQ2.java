/*
public class PracticeQ2 {
    
public static void length(String name, int idx, int len) {
    
//base case
if (idx == name.length()) {
    System.out.println(len);
    return;
}

//kaAm
length(name, idx + 1, len + 1);

}

public static void main(String[] args) {
        String name = "Purushottam";
        length(name, 0, 0);
    }
}

 */
//------------------------------------------------------------------------------
/*
Question4:We are given a stringS,weneedtofindthecountofallcontiguoussubstringsstarting and ending with the same character.

Sample Input 1: S = "abcab"
Sample Output 1: 7
There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b Out of theabovesubstrings,thereare7substrings:a,abca,b,bcab,c,aandb.So,only7contiguous substrings start and end with the same character.

Sample Input 2: S = "aba"Sample 
Output 2: 4
The substrings are a, b, a and aba
 */
import java.util.Scanner;

public class PracticeQ2 {
    public static int SameSubString(String str, int idx, int count){

        
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx = 0;
        int count = 0;

        SameSubString(str, idx, count);

    }
}
//------------------------------------------------------------------------------

