// public class Day1{
//     public static void main(String [] args)
//     {
//         System.out.println("Hello World");
//     }
// } 

// public class Day1 {
//     public static void main(String args[]) {
//         System.out.print("****\n");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }
// public class Day1{
//     public static void main(String args []){
//         int a = 10;
//         int b = 20;
//         String name = "Purushottam";
//         System.out.println(b);
//         System.out.println(name+ ":" + a );
//     }
// }
//Datatypes in java
// public class Day1 {
//     public static void main(String[] args) {
//         //byte
//         byte a = 127;
//         System.out.println(a);
//         //short
//         short s = 32165;
//         System.out.println(s);
//         //int 
//         int num = 1234567890;
//         System.out.println(num);
//         //long
//         long l = 1234567890123456789L;
//         System.out.println(l);
//         //float
//         float f = 3.14f;
//         System.out.println(f);
//         //double
//         double d = 3.141592653589793;
//         System.out.println(d);
//         //char 
//         char ch = 'a';
//         System.out.println(ch);
//         //boolean
//         boolean isJavaFun = true;
//         System.out.println(isJavaFun);
//    }
// }
//sum of two numbers
// public class Day1 {
//     public static void main(String [] args){
//         int a = 10;
//         int b = 20;
//         System.out.println("Sum of a and b is: " + (a+b));
//     }
// }
//Area of Circle
// public class Day1 {
//     public static void main(String args []){
//         double radius = 5.25;
//         double area = Math.PI * radius * radius;
//         System.out.println("The area of the circle: " + area);
//     }
// }
//input function in java
// import java.util.Scanner;
// public class Day1 {
//     public static void main(String args[]) {
//         //word
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         System.out.println(name);
//         //sentence or para
//         Scanner sc1 = new Scanner(System.in);
//         String sentence = sc1.nextLine();
//         System.out.println(sentence);
//         //integer
//         Scanner sc2 = new Scanner(System.in);
//         int num = sc2.nextInt();
//         System.out.println(num);
//         //float
//         Scanner sc3 = new Scanner(System.in);
//         float f = sc3.nextFloat();
//         System.out.println(f);
//         //double
//         Scanner sc4 = new Scanner(System.in);
//         double d = sc4.nextDouble();
//         System.out.println(d);
//         //boolean
//         Scanner sc5 = new Scanner(System.in);
//         boolean isJavaFun = sc5.nextBoolean();
//         System.out.println(isJavaFun);
//         //long
//         Scanner sc6 = new Scanner(System.in);
//         Long l = sc6.nextLong();
//         System.out.println(l);
//         //byte
//         Scanner sc7 = new Scanner(System.in);
//         byte b = sc7.nextByte();
//         System.out.println(b);
//         //short
//         Scanner sc8 = new Scanner(System.in);
//         short s = sc8.nextShort();
//         System.out.println(s);
//     }
// }
// import java.util.Scanner;
// public class Day1{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a num1: ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter a num2: ");
//         int num2 = sc.nextInt();
//         int product = num1 * num2;
//         System.out.println(product);
//     }
//     }
// import java.util.*;
// public class Day1 {
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the radius of the circle: ");
//         double radius = sc.nextDouble();
//         double area = Math.PI * radius * radius;
//         System.out.println("The area of the circle is: " + area);
//     }
// }
//Type COnversion in java
// public class Day1{
//     public static void main(String args[]){
//         char a = 'a';
//         int d =a; // implicit type conversion
//         System.out.println(d);
//     }
// }
// public class Day1{
//     public static void main(String args[]){
//         double a = 50.555;
//         int d = (int)a; // implicit type conversion
//         System.out.println(d);
//     }
// }
// public class Day1 {
//     public static void main(String args[]) {
//         char a = 'a';
//         char d = 'd';
//         int c =  (int)( d -  a);
//         System.out.println(c);
//         byte b1 = 10;
//         byte b2 = 20;
//         byte sum = (byte)(b1 + b2); // byte is promoted to int during addition, then cast back to byte
//         System.out.println(sum);
//     }
// }
//Practice Set
// Question1:In a program,input3numbers:A,BandC.You have to out put the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N
// import java.util.Scanner;
// public class Day1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number A:");
//         int A = sc.nextInt();
//         System.out.println("Enter number B:");
//         int B = sc.nextInt();
//         System.out.println("Enter number C:");
//         int C = sc.nextInt();
//         float average = (A + B + C) / 3;
//         System.out.println(average);
//     }
// }
//Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.(Hint : area of a square is (side x side))
// import java.util.Scanner;
// public class Day1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the side of the square:");
//         float side = sc.nextFloat();
//         double area = side * side;
//         System.out.println("The area of the square is: " + area);
//     }
// }
// Question3:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
// import java.util.Scanner;
// public class Day1{
//     public static void main(String [] args){
//         Scanner asc = new Scanner(System.in);
//         System.out.println("Enter the cost of Pencil:");
//         float pencil = asc.nextFloat();
//         System.out.println("Enter the cost of Pen:");
//         float pen = asc.nextFloat();
//         System.out.println("Enter the cost of Eraser:");
//         float eraser = asc.nextFloat();
//         float total = pencil + pen + eraser;
//         System.out.println("The total cost of the items is:" + total);
//         // Adding 18% GST tax
//         float newtotal_cost = total + (total * 0.18f);
//         System.out.println("The total cost of the items with 18% GST tax is:" + newtotal_cost);
//     }
// }



// public class Day1 {

//     public static void main(String[] args) {

//         int $ = 100;
//         System.out.println($);
//     }
// }


