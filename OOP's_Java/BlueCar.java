// abstract class Car{
//     static{
//         System.out.print("1");
//     }
//      public Car(String name) 
//      {
//         // super(); 
//         System.out.print("2");
//      }
//      { System.out.print("3");
//      }
//     } 
//     public class BlueCar extends Car{
//         {
//             System.out.print("4");
//         }
// public BlueCar() {
//     super("blue"); 
//     System.out.print("5");
// }
//  public static void main(String[]gears) {
//     new BlueCar();
// }}
// //================----------------------========================-------------

class Complex{
    int real;
    int img;

    public Complex(int r, int i){
        real = r;
        img = i;   
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.img + b.img));
    }
    public static Complex prod(Complex a, Complex b){
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real*b.img)+(a.img*b.real)));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public void printComplex(){
        if(real == 0 && img != 0){
            System.out.println(img + "i");
        }else if(img == 0 && real != 0){
            System.out.println(real);
        }else{
            System.out.println(real + "+" + img + "i");
        }
    }
}

public class BlueCar{
    public static void main(String args[]){
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.prod(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}