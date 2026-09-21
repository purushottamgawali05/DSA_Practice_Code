/*

*  *  *  *  * 
*           *
*           *
*  *  *  *  *
public class Day7 {
    
public static void Hollo_Rectangle(int rows, int columns) {
    
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= columns; j++) {
        if (i == 1 || i == rows || j == 1 || j == columns) {
            System.out.print(" * ");
        } else {
            System.out.print("   ");
    }
}
System.out.println();
}

}

public static void main(String args[]) {
    Hollo_Rectangle(4, 5);
}
}

 */

 /*

//           * 
//        *  *
//     *  *  *
//  *  *  *  *
public class Day7 {
    
public static void Inverted_Roteted_Half_Pyramid(int rows, int columns) {
    for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 4; j++) {
            //     if (i + j >= 5) {
                //         System.out.print(" * ");
                //     } else {
                    //         System.out.print("   ");
                    // }
                    if (j <= 4 - i) {
                        System.out.print("   ");
                    } else {
                        System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Inverted_Roteted_Half_Pyramid(4, 4);
    }
}
 */
 /*

1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

public class Day7 {
    
public static void Invrted_Half_Pyramid(int rows, int cols) {
    
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        if (j <= cols - i + 1) {
            System.out.print(j + " ");
        } else {
            System.out.print("  ");
    }
}
System.out.println();
}
}

public static void main(String args[]) {
    Invrted_Half_Pyramid(5, 5);
}
}

 */

 /*

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

public class Day7 {
    
public static void Floyds_Triangle(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (j <= i) {
                
            System.out.print(num + " ");
            num++;
        }
    }
    System.out.println();
}
}

public static void main(String args[]) {
    Floyds_Triangle(5);
    }
}
 */

 /*
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

public class Day7 {
    
public static void Zero_One_Triangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print("0 ");
        }
    }
    System.out.println();
}
}

public static void main(String args[]) {
    Zero_One_Triangle(5);
}
}

 */
 /*

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

public class Day7 {
    
public static void Butterfly_Pattern(int n) {
    //first half
    for (int i = 1; i <= n; i++) {
        //first part
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        
        //spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        
        //second part
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        
        System.out.println();
        
    }
    
    //second half
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.err.println();
        
    }
}

public static void main(String args[]) {
    Butterfly_Pattern(4);
}
}

 */

 /*

    *****
   *****
  *****
 *****
*****   

public class Day7 {
    
public static void Rhombus_Pattern(int n) {
    
for (int i = 1; i <= n; i++) {
    
for (int j = 1; j <= n - i; j++) {
    System.out.print(" ");
}

for (int j = 1; j <= n; j++) {
    System.out.print("*");
}

System.out.println();
}
}

public static void main(String args[]) {
    Rhombus_Pattern(5);
}
}

 */
 /*

    *****
   *   *
  *   *
 *   *
*****


public class Day7 {
    
public static void Hollow_Rhombus_Pattern(int n) {
    
for (int i = 1; i <= n; i++) {
    
for (int j = 1; j <= n - i; j++) {
    System.out.print(" ");
}

for (int j = 1; j <= n; j++) {
    if (i == 1 || i == n || j == 1 || j == n) {
        System.out.print("*");
    } else {
        System.out.print(" ");
}

}

System.out.println();
}
}

public static void main(String args[]) {
    Hollow_Rhombus_Pattern(5);
}
}
 */
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
// public class AdvancePatterns {

//     public static void Diamond_Pattern(int n) {

// //first half
//         for (int i = 1; i <= n; i++) {
//             //spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             //stars
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

// //second half
//         for (int i = n; i >= 1; i--) {

// //spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

// //stars
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }

//     public static void main(String args[]) {
//         Diamond_Pattern(4);

//     }

// }


//-----------------------------------------------------------------------------
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class AdvancePatterns {
    
    public void butterflyPattern(int n){
        for(int row = 1; row<=n; row++){
            
            for(int star = 1; star<=row; star++){
                System.out.print("*");
            }
            
            for(int space = 1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
            
            for(int star = 1; star<=row; star++){
                    System.out.print("*");
            }
            System.out.println();    
        }
        
        
        for(int row = n; row>=1; row--){
            
            for(int star = 1; star<=row; star++){
                System.out.print("*");
            }
            
            for(int space = 1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
            
            for(int star = 1; star<=row; star++){
                    System.out.print("*");
            }
            System.out.println();    
        }
    }
    
    public void rhombusPattern(int n){
        for(int row=1; row<=n; row++){
            
            //spaces
            for(int space=1; space<=n-row; space++){
                System.out.print("@");
            }
            
            //stars
            for(int star = 1; star <= n; star++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
/*    
    public void hollowRhombusPattern(int n){
        
        for(int row=1; row<=n; row++){
            
            //spaces
            for(int space = 1; space <= n-row; space++){
                System.out.print(" ");
            }
            
            //stars
            for(int star = 1; star <= n; star++){
                if(star == 1 || star == n || row == 1 || row == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Main m = new Main();
        
        // m.butterflyPattern(n);
        // m.rhombusPattern(n);
        m.hollowRhombusPattern(n);
    }
}

 */
