package Loops;

//WHILE LOOP

/*
public class Day4 {
    
public static void main(String[] args) {
    
int i = 1;

while (i <= 100) {
    System.out.print("Hello World" + " ");
    i++;
}
}
}
 */

 /*
public class Day4 {
    
public static void main(String[] args) {
    
int i = 1;
while (i <= 10) {
    System.err.println(i);
    i++;
}
}

}
 */
 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter n: ");
int n = sc.nextInt();

int i = 1;
while (i <= n) {
    System.out.println(i);
    i++;
}
}
}

 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter n: ");
int n = sc.nextInt();

int sum = 0;

int i = 1;

while (i <= n) {
    sum += i;
    i++;
}

System.out.println(sum);
}
}

 */
 /*
public class Day4 {
    
public static void main(String[] args) {
    int i = 1;
    // int n = 4;
    
    while (i <= 4) {
        System.out.println("****");
        i++;
    }
}
}
 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter n: ");
int n = sc.nextInt();

while (n > 0) {
    int lastDigit = n % 10;
    System.out.print(lastDigit);
    n /= 10;
}
}
}
 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter n: ");
int n = sc.nextInt();

int reverse = 0;

while (n > 0) {
    int lastDigit = n % 10;
    reverse = (reverse * 10) + lastDigit;
    n /= 10;
}
System.out.println(reverse);
}
}
 */
//FOR LOOP
/*
public class Day4 {
    
public static void main(String[] args) {
    
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
}
}
 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter n: ");
int n = sc.nextInt();

for (int i = 1; i <= n; i++) {
    System.out.println(i);
}
}
}
 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String args[]) {
    
Scanner ac = new Scanner(System.in);

System.out.println("Enter n: ");
int n = ac.nextInt();

int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
System.out.println(sum);
}
}
 */

 /*
public class Day4 {
    
public static void main(String args[]) {
    
for (int i = 1; i <= 4; i++) {
    System.out.println("****");
}
}
}
 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int number = sc.nextInt();

for (int i = number; i > 0; i /= 10) {
    int lastDigit = i % 10;
    System.out.print(lastDigit);
    // number /= 10;
}
}
}
 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int number = sc.nextInt();

int reverse = 0;

for (int i = number; i > 0; i /= 10) {
    int lastDigit = i % 10;
    reverse = (reverse * 10) + lastDigit;
    // number /= 10;
}

System.out.println(reverse);
}
}
 */
//Do-WHILE LOOP

/*
public class Day4 {
    
public static void main(String[] args) {
    
int i = 1;

        do {
            System.out.println("Hello World" + i);
            i++;
        } while (i <= 10);
    }
}

 */

 /*
public class Day4 {
    
public static void main(String[] args) {
    
int i = 1;
int sum = 0;

do {
    System.out.println("The i is: " + i);
    sum += i;
    if (sum == 6) {
        break;
    }
    i++;
} while (i <= 10);
System.out.println(sum);
}
}
 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

do {
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    
    if (num % 10 == 0) {
        break;
    }
    System.out.println("The number was: " + num);
} while (true);
}
}
 */

 /*
public class Day4 {
    
public static void main(String args[]) {
    
//     for (int i = 1; i <= 10; i++) {
    //         if (i == 6) {
        //             continue;
        //         }
        //         System.out.print(i + " ");
        //     }
        
        
        int i = 1;
        do {
            if (i == 6) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }
}
 */

 /*
import java.util.Scanner;

public class Day4 {

public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

do {
    
System.out.print("Enter your number: ");
int num = sc.nextInt();

if (num % 10 == 0) {
    continue;
}
System.out.println("The number was: " + num);

} while (true);

}
}
 */
//Prime or Not
/*
import java.util.Scanner;

public class Day4 {
    
public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter Your Number: ");

if (!sc.hasNextInt()) {
    System.out.println("Enter valid number!");
    return;
}

int number = sc.nextInt();
sc.close();

if (number < 2) {
    System.out.println("The entered number is not prime!");
    return;
}

boolean isPrime = true;

if (number == 2) {
    System.out.println("The number is Prime");
} else {
    
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
        }
    }
}

if (isPrime) {
    System.out.println("The number is Prime");
} else {
    System.out.println("The number is not Prime");
}
}
}

 */
//Question2:Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
/*import java.util.Scanner;

public class Day4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers do you want to enter: ");
        int n = sc.nextInt();

        int number;
        // int choice = 1;

        int i = 1;
        int evensum = 0;
        int oddsum = 0;

        // System.out.println("Enter the number: ");
        // number = sc.nextInt();
        while (i <= n) {
            System.out.println("Enter the numbers: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

            i++;
            // System.out.println("Enter 1 to continue and 0 to terminate");
            // choice = sc.nextInt();

        }

        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers is: " + oddsum);
    }
}
 */
//factorial

/*
import java.util.Scanner;

public class Day4 {
    
public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int number = sc.nextInt();

int i = 1;

int fact = 1;

do {
    
fact = fact * i;
i++;
} while (i <= number);

System.out.println("The factorial of the number is: " + fact);
}
}

 */

 /*
import java.util.Scanner;

public class Day4 {
    
public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int number = sc.nextInt();

for (int i = 1; i <= 10; i++) {
    System.out.println(number + "*" + i + ":" + (i * number));
}
}
}
 */
// public class Day4 {
//     public static void main(String[] args) {
//         int v = 5;
//         int u = 10;
//         int a = 2;
//         int s = 3;
//         int result = (((v * v) - (u * u)) / (2 * a * s));
//         System.out.println(result);
//     }
// }

/*
import java.util.Scanner;

public class Day4 {
    
public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the marks is first subject: ");
int m1 = sc.nextInt();

System.out.println("Enter the marks is second subject: ");
int m2 = sc.nextInt();

System.out.println("Enter the marks is third subject: ");
int m3 = sc.nextInt();

float Percentage = ((m1 + m2 + m3) / 300) * 100;

if (Percentage >= 40 && (m1 >= 33 && m2 >= 33 && m3 >= 33)) {
    System.out.println("The Student Has Passed The Exam");
} else {
    System.out.println("The Student Has Not Passed The Exam");

}

}
}
 */
import java.util.Scanner;

public class Day4 {

    // Method to determine website type
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter website URL: ");
        String url = scanner.nextLine();

        if (url == null || url.trim().isEmpty()) {
            System.out.println("Invalid input: URL cannot be empty.");
        }

        url = url.trim().toLowerCase();

        // Check if URL contains a valid domain extension
        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organizational Website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("Unknown Website");
        }

        // Display result
        // System.out.println(getWebsiteType(url));
        // scanner.close();
    }
}
