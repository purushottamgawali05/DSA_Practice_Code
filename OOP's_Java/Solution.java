// class Automobile{
//     private String drive(){
//         return "Driving Vehicle";
//     }
// }

// class Car extends Automobile{
//     protected String drive(){
//         return "Driving Car";
//     }
// }
// public class ElectricCar extends Car{
//     public final String drive(){
//         return "Driving Electric Car";
//     }
//     public static void main(String args[]){
//         final Car car = new ElectricCar();
//         System.out.println(car.drive());
//     }
// }
//--------------------===============================-------------------===================
// abstract class Car {
//     static {
//         System.out.println("1");
//     }
//     public Car(String Name) {
//         super();
//         System.out.println("2");
//     }
//     {
//         System.out.println("3");
//     }
// }
// public class BlueCar1 extends Car {
//     {
//         System.out.println("4");
//     }
//     public BlueCar1() {
//         super("blue");
//         System.out.println("5");
//     }
//     public static void main(String[] gears) {
//         new BlueCar1();
//     }
// }
//======================--------------==========-------------=-----------------==========-----------
//Question1:Printthesum,differenceandproductoftwocomplexnumbersbycreatingaclassnamed'Complex'withseparatemethodsforeachoperationwhoserealandimaginaryparts are entered by the user.
// import BlueCar1.Complex;
class Complex {

    int real;
    int img;

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex prod(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.img) + (a.img * b.real)));
    }

    public void printComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (real != 0 && img == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }
}

public class Solution {

    public static void main(String args[]) {
        Complex c = new Complex(5, 5);
        Complex d = new Complex(9, 8);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.prod(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
