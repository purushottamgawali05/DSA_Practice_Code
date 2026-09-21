package Functions;

/*

Hello World1
Hello World2
Hello World3

public class Day6 {
    
public static void Hello() {
    System.out.println("Hello World1");
    System.out.println("Hello World2");
    System.out.println("Hello World3");
}

public static void main(String args[]) {
    Hello();
}
}
 */

 /*
import java.util.Scanner;

public class Day6 {
    
public static int Sum(int a, int b) {
    
int sum = a + b;
return sum;
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the first number: ");
int num1 = sc.nextInt();

System.out.println("Enter the second number: ");
int num2 = sc.nextInt();

int theSum = Sum(num1, num2);

System.out.println("The sum is: " + theSum);
}
}

output:
Enter the first number: 
11
Enter the second number: 
22
The sum is: 33


 */

 /*
Enter the first number:  
5
Enter the second number: 
10
The product is: 50

import java.util.Scanner;

public class Day6 {
    
public static int multiply(int num1, int num2) {
    int product = num1 * num2;
    return product;
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the first number:  ");
int num1 = sc.nextInt();

System.out.println("Enter the second number: ");
int num2 = sc.nextInt();

int prod = multiply(num1, num2);

System.out.println("The product is: " + prod);

}
}

 */

 /*

Enter the number: 
5
The factorial is: 120

import java.util.Scanner;

public class Day6 {
    
public static int Factorial(int num) {
    int fact = 1;
    
    if (num < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return -1; // Return -1 to indicate an error
    } else if (num == 0 || num == 1) {
        return 1; // Factorial of 0 and 1 is 1
    } else {
        
        while (num > 0) {
            fact = fact * num;
            num--;
        }
    }
    return fact;
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int num = sc.nextInt();

int factorails = Factorial(num);

System.out.println("The factorial is: " + factorails);
}
}
 */

 /*
import java.util.Scanner;

public class Day6 {
    
public static int Fractorial(int num) {
    
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int num = sc.nextInt();
int fact = 1;

if (num < 0) {
    System.out.println("factorial is not defined for negative numbers");
    return -1;
} else if (num == 0 || num == 1) {
    return 1;
} else {
    for (int i = 1; i <= num; i++) {
fact *= i;
}
return fact;
}

}

public static int Binomial(int num, int r) {
    
int n_fact = Fractorial(num);
int r_fact = Fractorial(r);
int n_r_fact = Fractorial(num - r);

int BC = n_fact / (r_fact * n_r_fact);

return BC;
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of num: ");
int num = sc.nextInt();
System.out.println("Enter the value of r:");
int r = sc.nextInt();
int BC1 = Binomial(num, r);
System.out.println("The Binomial Coefficient is: " + BC1);

}
}

Enter the value of num: 
5
Enter the value of r:
2
The Binomial Coefficient is: 10

 */

 /*
// Method Overloading
//using the same method name with different parameters
public class Day6 {
    
public static int sum(int a, int b) {
    return a + b;
}

public static int sum(int a, int b, int c) {
    return a + b + c;
}

public static void main(String args[]) {
    System.out.println(sum(1, 2));
    System.out.println(sum(1, 2, 3));
}
}
 */

 /*
// Method Overloading
//using Different data types with the same method name
public class Day6 {
    
public static int sum(int a, int b) {
    return a + b;
}

public static float sum(float a, float b) {
    return a + b;
}

public static void main(String args[]) {
    System.out.println(sum(2, 5));
    System.out.println(sum(2.5f, 3.5f));
}
}

 */

 /*
//check a number is prime or not using function
public class Day6 {
    
public static boolean isPrime(int num) {
    
boolean isPrime = true;

if (num < 1) {
    System.out.println("Number should be grater than 1");
    return false;
} else if (num == 1) {
    System.out.println("1 is neither prime nor composite");
    return false;
} else if (num == 2) {
    System.out.println("2 is a prime number");
    return true;
} else {
    for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
    return false;
}
}
}
return isPrime;

}

public static void main(String args[]) {
    System.out.println(isPrime(11));
}
}


//

 */

 /*
//print prime numbers between 1 to n using function
public class Day6 {
    
public static boolean isPrime(int num) {
    if (num == 2) {
        return true;
    } else if (num < 2) {
        return false;
    } else {
        for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
        return false;
    }
}
        }
        return true;
    }
    
    public static void isPrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                
            }
        }
    }
    
    public static void main(String args[]) {
        isPrimeInRange(100);
    }
}

 */

 /*
//Binary To Decimal
public class Day6 {
    
public static void BinToDec(int BinNum) {
    int myBinNum = BinNum;
    int pow = 0;
    int Dec = 0;
    
    while (BinNum > 0) {
        int LastDigit = BinNum % 2;
        Dec = Dec + (LastDigit * (int) Math.pow(2, pow));
        
        pow++;
        BinNum = BinNum / 10;
    }
    System.out.println("The Decimal number " + "of " + myBinNum + " is " + Dec);
}

public static void main(String args[]) {
    BinToDec(101010);
    
}
}

 */

 /*
//Decimal To Binary
public class Day6 {
    

public static void DecToBin(int num) {
    int myNum = num;
    int pow = 0;
    int BinNum = 0;
    
    while (num > 0) {
        int rem = num % 2;
        BinNum = BinNum + (rem * (int) Math.pow(10, pow));
        pow++;
        num = num / 2;
    }
    System.out.println("The Binary number of " + myNum + " is " + BinNum);
    
}

public static void main(String args[]) {
    DecToBin(5);
}
}
//01

 */
 /*
//FUNCTIONS QUESTIONSQuestion
//  1 :Write a Java method to compute the average of three numbers..
import java.util.Scanner;

public class Day6 {
    
public static void Avrg(int num, int num2, int num3) {
    int sum = num + num2 + num3;
    float avrg = sum / 3.0f;
    
    System.out.println("The average of " + num + ", " + num2 + ", and " + num3 + " is: " + avrg);
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the first number: ");
int num = sc.nextInt();

System.out.println("Enter second number: ");
int num2 = sc.nextInt();

System.out.println("Enter the third number:");
int num3 = sc.nextInt();

Avrg(num, num2, num3);

}
}

 */

 /*
//Question2:WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod.
 */
 /*
import java.util.Scanner;

public class Day6 {
    
public static boolean isEven(int num) {
    
if (num % 2 == 0) {
    return true;
} else {
    return false;
}
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number:");
int num = sc.nextInt();

isEven(num);

if (isEven(num)) {
    System.out.println("The number " + num + " is Even Number");
} else {
    System.out.println("The number " + num + " is Odd Number");
}

}
}
 */
//Question3:WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321.

/*
import java.util.Scanner;

public class Day6 {
    
public static int Palindrome(int num) {
    int reversed = 0;
    
    while (num > 0) {
        int LastDigit = num % 10;
        reversed = (reversed * 10) + LastDigit;
        num = num / 10;
        
    }
    return reversed;
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int num = sc.nextInt();

int finalNum = Palindrome(num);
System.out.println("The reverse of " + num + " is " + finalNum);
}
}
 */

 /*
//vQuestion 4 :READ&CODEEXERCISESearch about(Google) & use the following methods of the Math class in Java:
// a.Math.min( )
// b.Math.max( )
// c.Math.sqrt( )
// d.Math.pow( )
// e.Math.avg( )
// f.Math.abs( )
public class Day6 {
    
public static void main(String args[]) {
    int a = 10, b = 20, e = -16;
    
    double c = 2.2, d = 3.3;
    
    System.out.println("The minimum number is: " + Math.min(a, b));
    System.out.println("The minimum number is: " + Math.min(c, d));
    
    System.out.println("The maximum number is: " + Math.max(a, b));
    System.out.println("The maximum number is: " + Math.max(c, d));
    
    System.out.println("The Square root of the given number is: " + Math.sqrt(a));
    System.out.println("The Square root of the given number is: " + Math.sqrt(d));
    
    System.out.println("The a to the power b of the given number is: " + Math.pow(a, b));//a^b
    System.out.println("The c to the power d of the given number is: " + Math.pow(c, d));//c^d
    
    System.out.println("The average of a and b is: " + ((a + b) / 2.0));
    System.out.println("The average of c and d is: " + ((c + d) / 2.0));
    
    System.out.println("The absolute value of e is: " + Math.abs(e));
    
}
}

 */

 /*
//Question 5 :Write a Java method to compute the sum of the digits in an integer.(Hint: Approach this question in the following way:a.Take a variable sum = 0b.Find the last digit of the numberc.Add it to the sumd.Repeat a & b until the number becomes 0 )
import java.util.Scanner;

public class Day6 {
    
public static int SumOfDigits(int num) {
    int sum = 0;
    
    while (num > 0) {
        int lastDigit = num % 10;
        sum = sum + lastDigit;
        num /= 10;
    }
    return sum;
}

public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int num = sc.nextInt();

int FinalSum = SumOfDigits(num);

System.out.println("The sum of the digits is: " + FinalSum);

}
}

 */



