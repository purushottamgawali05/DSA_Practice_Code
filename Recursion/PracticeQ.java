/*

Question1:For a given integer array of size N.Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.Usearecursivefunctiontosolvethisproblem.

Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},
key = 2
Sample Output: 1 5 7 8

public class PracticeQ {
    
public static void occ(int arr[], int key, int index) {
    
//base case   
if (index == arr.length) {
    return;
        }
        
        //kaam
        if (arr[index] == key) {
            System.out.print(index + " ");
            occ(arr, key, index + 1);
        } else {
            occ(arr, key, index + 1);
    }
}

public static void main(String Indices[]) {
    int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    int key = 2;
    int index = 0;
    occ(arr, key, index);
}
}
 */
//-----------------------------------------------------------------------------------

/*
Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.

Sample Input: 1947
Sample Output: “one nine four seven”
 */
import java.util.Scanner;

public class PracticeQ {

    public static void NumWord(String NumStr, int idx) {
        //base case
        if (idx == NumStr.length()) {
            return;
        }

        //kaAm
        // char idxVal = NumStr.charAt(idx);
        switch (NumStr.charAt(idx)) {
            case '0':
                System.out.print("zero ");
                break;
            case '1':
                System.out.print("one ");
                break;
            case '2':
                System.out.print("two ");
                break;
            case '3':
                System.out.print("three ");
                break;
            case '4':
                System.out.print("four ");
                break;
            case '5':
                System.out.print("five ");
                break;
            case '6':
                System.out.print("six ");
                break;
            case '7':
                System.out.print("seven ");
                break;
            case '8':
                System.out.print("eight ");
                break;
            case '9':
                System.out.print("nine ");
                break;
        }
        NumWord(NumStr, idx + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String NumStr = Integer.toString(number);

        if (NumStr.charAt(NumStr.length() - 1) == '0') {
            System.out.println("Not Allowed");
        }

        NumWord(NumStr, 0);
    }
}


//-----------------------------------------------------------------------------------
