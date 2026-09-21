
/*
import java.util.Scanner;

public class Day8 {
    
public static void main(String args[]) {
    
// Array declaration
int Marks[] = new int[10];

//Array Declaration and Intialisation
// int Marks [] = {99, 98, 65, 89, 91};
//Input
Scanner sc = new Scanner(System.in);

System.out.println("Enter the marks: ");
Marks[0] = sc.nextInt();
Marks[1] = sc.nextInt();
Marks[2] = sc.nextInt();
Marks[3] = sc.nextInt();

//Output
System.out.println("The marks of M1: " + Marks[0]);
System.out.println("The marks of M2: " + Marks[1]);
System.out.println("The marks of DM " + Marks[2]);
System.out.println("The marks of Physics: " + Marks[3]);

//Update
Marks[1] = 100;
System.out.println("The Updated marks of M2 are: " + Marks[1]);

float Avg = (Marks[1] + Marks[2] + Marks[3] + Marks[4]) / 4.0f;
System.out.println("The average of the marks is: " + Avg);

int lengthOfArray = Marks.length;
System.out.println("The length of the array is: " + lengthOfArray);

}
}
 */

 /*
//Arrays as a function arguments
public class Day8 {
    
public static void Update(int numbers[]) {
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = numbers[i] + 10;
    }
    
    // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
    }
    
    public static void main(String args[]) {
        
    int numbers[] = {90, 80, 70};
    Update(numbers);
    
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}
}

 */

 /*

 
 
 //Linear Search Algorithm
 public class Day8 {
    
 // public static int LinearSearch(int numbers[], int Key) {
    //     for (int i = 0; i < numbers.length; i++) {
        //         if (numbers[i] == 1) {
            //             return i;
            //         }
            //     }
            //     return -1;
            // }
            // int numbers[] = {2, 4, 6, 8, 10, 12};
            // int key = 1;
            // int index = LinearSearch(numbers, key);
            // if (index == -1) {
                //     System.out.println("The 1 is NOT FOUND");
                // } else {
                    //     System.out.println("The 1 is at index: " + index);
                    // }
                    public static int LinearSearch(String menu[], String key) {
                        
                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i] == "Vada Pav") {
                            return i;
                        }
                    }
                    return -1;
                }
                
                public static void main(String[] args) {
                    
                String menu[] = {"Aloo Gonda", "Samosa", "Vada Pav", "Karanji", "Puran Poli"};
                String key = "Vada Pav";
                
                int index = LinearSearch(menu, key);
                
                if (index == -1) {
                    System.err.println("Not Found");
                } else {
                    System.out.println("The Vada Pav Found at index: " + index);
            }
        }
        
    }
 */




/*
public class Day8 {
    
//     public static int FindMax(int numbers[], int largestNum) {
    //     for (int i = 0; i < numbers.length; i++) {
        //         if (numbers[i] > largestNum) {
            //             largestNum = numbers[i];
            //         }
            //     }
            //     return largestNum;
            // }
            // public static void main(String args[]) {
                // int numbers[] = {2, 3, 4, 5, 416, 7, 8, 9};
                // int largestNum = Integer.MIN_VALUE;
                // int TheLargestNum = FindMax(numbers, largestNum);
                // System.out.println("The largest number is: " + TheLargestNum);
                // }
                public static int FindMin(int numbers[], int smallestNum) {
                    
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] < smallestNum) {
                        smallestNum = numbers[i];
                    }
                }
                return smallestNum;
            }
            
            public static void main(String args[]) {
                
            int numbers[] = {2, 3, 4, 5, 416, 7, 8, 9};
            int smallestNum = Integer.MAX_VALUE;
            
            int TheLargestNum = FindMin(numbers, smallestNum);
            
            System.out.println("The largest number is: " + TheLargestNum);
            
        }
    }
    */
