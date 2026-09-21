// package Conditions;

// public class Day3 {
//     public static void main(String[] args) {
//         int age = 10;
//         if (age >= 18) {
//             System.out.println("The candidate is eligible to vote");
//         }
//         if (age > 28) {
//             System.out.println("The candidate is a teenager"); 
//         }else {
//             System.out.println("The candidate is not eligible to vote");
//         }
//     }
// }
//Largest of two numbers
/* 
import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("The first number is greater: " + num1);
        } else {
            System.out.println("The second number is greater: " + num2);
        }
    }
}
 */
//Even or Odd
/*
import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}

 */

 /*
import java.util.Scanner;

public class Day3 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if (age >= 1 && age <= 5) {
            System.out.println("The person is an infant");
            System.out.println("The person is a toddler");
        } else if (age >= 6 && age <= 10) {
            System.out.println("The person is a child");
        } else if (age >= 11 && age <= 15) {
            System.out.println("The person is a teenager");
        } else {
            System.out.println("The person is an adult");
    }
}
}

 */
// Tax Calculation

/*
import java.util.Scanner;

public class Day3 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("The the Salary: ");
int salary = sc.nextInt();

int tax;

if (salary <= 500000) {
    tax = 0;
    System.out.println("The tax is 0%");
} else if (salary >= 500000 && salary <= 1000000) {
    tax = (int) (salary * (0.2));
    System.out.println("The tax is 20%");
} else {
    tax = (int) (salary * (0.3));
System.out.println("The tax is 30%");
}

System.out.println("The tax is: " + tax);
}
}
 */
// Largest of three numbers

/*
import java.util.*;

public class Day3 {
    
public static void main(String[] args) {
    
Scanner large = new Scanner(System.in);

System.out.println("Enter the first number: ");
int num1 = large.nextInt();

System.out.println("Enter the second number: ");
int num2 = large.nextInt();

System.out.println("Enter the third number: ");
int num3 = large.nextInt();

if (num1 >= num2 && num1 >= num3) {
    System.out.println("The first number is the largest number:" + num1);
} else if (num2 >= num3) {
    System.out.println("The second number is the largest number: " + num2);
} else {
    System.out.println("The third number is the largest number: " + num3);
}
}
}


 */
//Ternary Operator

/* 
import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 35) ? "Pass" : "Fail";
        // System.out.print(result);

    }
}

 */
//Switch Statement

/*
import java.util.Scanner;

public class Day3 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number:");
int num1 = sc.nextInt();

System.out.println("Enter the second number: ");
int num2 = sc.nextInt();

System.out.println("Enter the operator:");
char operator = sc.next().charAt(0);

switch (operator) {
    
case '+':
    System.out.println("The sum is: " + (num1 + num2));
    break;
    
    case '-':
        System.out.println("The difference is: " + (num1 - num2));
        break;
        
        case '*':
            System.out.println("The product is: " + (num1 * num2));
            break;
            
            case '/':
                System.out.println("The quotient is; " + (num1 / num2));
                break;
                
                case '%':
                    System.out.println("The remainder is: " + (num1 % num2));
                    break;
                    
                    default:
                        System.out.println("Enter a valid operator");
                    }
                }
            }

 */
//Nested Switch Statement
// import java.util.Scanner;
// public class Day3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the day of the week (1-7): ");
//         int day = sc.nextInt();
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day of the week");
//         }
//     }
// }
//Practice Problem: Check if a number is positive, negative, or zero
/*
import java.util.Scanner;

public class Day3 {
    
public static void main(String[] args) {
    
System.out.println("Enter a number: ");

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

String result = (num > 0) ? "Positive" : "Negative";
result = (num == 0) ? "Zero" : result;
System.out.println("The number is: " + result);

// if (num > 0) {
    //     System.out.println("The number is positive");
    // } else if (num < 0) {
        //     System.out.println("The number is negative");
        // } else {
            //     System.out.println("The number is zero");
            // }
        }
    }
    
 */
// public class Day3 {
//     public static void main(String[] args) {
//         double temp = 103.5;
//         if (temp >= 100) {
//             System.out.println("The person has a fever");
//         } else {
//             System.out.println("The person does not have a fever");
//         }
//     }
// }

/*

public class Day3 {
    
public static void main(String[] args) {
    
int a = 63, b = 36;

boolean x = (a < b) ? true : false;
System.out.println(x);

int y = (a > b) ? a : b;
System.out.println(y);
}
}
 */


//Leap Year
/*
import java.util.Scanner;

public class Day3 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the year: ");
float year = sc.nextInt();

if ((year % 4 == 0 && year % 100 != 0)  || (year % 400 == 0)) {
    System.out.println(year + " is a leap year");
} else {
    System.out.println(year + " is not a leap year");
}
}
}
*/


