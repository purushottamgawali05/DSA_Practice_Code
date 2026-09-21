//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// ****
// ***
// **
// *
/*
public class Day5 {
    
public static void main(String args[]) {
    
for (int i = 1; i < 6; i++) {
    for (int j = 1; j <= 6 - i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
}
}

 */ /*
1
12
123
1234
public class Day5 {
    
public static void main(String args[]) {
    
int n = 4;

for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}


 */ /*

A
BC
DEF
GHIJ

public class Day5 {
    
public static void main(String args[]) {
    
char ch = 'A';

for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}
}
}

 */ /*

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15


public class Day5 {
    
public static void main(String[] args) {
    
int a = 1;

for (int i = 0; i <= 4; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print(a + " ");
        a++;
    }
    System.out.println();
}
}
}
 */ /*

*****
*****
*****
*****


public class Day5 {
    
public static void main(String args[]) {
    
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 */ /*

*****
*   *
*   *
*****
public class Day5 {
    
public static void main(String args[]) {
    
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= 5; j++) {
        if (j == 1 || i == 1 || j == 5 || i == 4) {
            System.out.print("*");
        } else {
            System.err.print(" ");
    }
}
System.out.println();
}
}
}
 */ /*
****
***
**
*

public class Day5 {
    
public static void main(String args[]) {
    
int n = 4;
int m = 5;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 */ /*
*
**
***
****


public class Day5 {
    
public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 4 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        
        System.out.println();
    }
}
}
 */ /*
1
12
123
1234
12345


public class Day5 {
    
public static void main(String args[]) {
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
}
 */ /*
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1


public class Day5 {
    
public static void main(String args[]) {
    
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
}
}
 */ /*

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15


public class Day5 {
    
public static void main(String args[]) {
    
int a = 1;

for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(a + " ");
        a++;
    }
    System.out.println();
}
}
}
 */ /*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

public class Day5 {
    
public static void main(String args[]) {
    
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        if ((i + j) % 2 == 0) {
            System.out.print("1" + " ");
        } else {
            System.out.print("0" + " ");
    }
}
System.out.println();
}
}
}
 */
//inverted star pattern
/*
*****
**** 
***  
**   
*    
public class Day5 {
    
public static void main(String args[]) {
    
int n = 5;

// for (int i = n; i >= 0; i--) {
    //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
            if (i + j <= n + 1) {
                
            System.out.print("*");
        } else {
            System.out.print(" ");
    }
}
System.out.println();
}
}
}

 */ /*
//print half pyramid of stars

1
12
123
1234

public class Day5 {
    
public static void main(String args[]) {
    
int n = 4;

// for (int i = 1; i <= n; i++) {
    //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

 */

 /*

A
BC
DEF
GHIJ

public class Day5 {
    
public static void main(String args[]) {
    
int n = 4;
char ch = 'A';

// for (int i = 1; i <= n; i++) {
    //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    
                System.out.print(ch);
                ch++;
            }
        }
        System.out.println();
    }
}
}
 */


 /*
 

public class Day5 {
    
public static void main(String args[]) {
    
int n = 4;

        for (int i = 1; i <= n; i++) {                       
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i + j <= n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
            }
        }
    }
    
    for (int i = n; i >= 1; i--) {
        
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

}
}
 */

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Day5 {

    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0 || i == 0 || j == m - 1 || i == n - 1) {
                    System.out.print(" * ");
                } else {
                      System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
