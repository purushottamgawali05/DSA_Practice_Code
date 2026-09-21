/*
    Compile-Time Polymorphism by Method Overloading

    public class PolyMorphism {
        public static void main(String args[]) {
            Addition add = new Addition();
            System.out.println(add.sum(5, 4));
            System.out.println(add.sum(5.5f, 6.4f));
            System.out.println(add.sum(1, 2, 3));
        }
    }
    
    class Addition {
        
    int sum(int num1, int num2) {
        return num1 + num2;
    }
    
    float sum(float num1, float num2) {
        return num1 + num2;
    }
    
    int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
 */
//--------------------------------------------------------------------------
/*
//Example of Polymorphism
public class PolyMorphism {
    
public static void main(String args[]) {
 // Creating a reference of type Person
        // but initializing it with Father class object
    Person p = new Father();

     // Calling the role method. It calls the
        // overridden version in Father class
        p.role();
    }
}

class Person {
    
    // Method that displays the
    // role of a person
void role() {
    System.out.println("I am a person");
}
}


// Derived class Father that
// overrides the role method
class Father extends Person {
    
 // Overridden method to show
    // the role of a father
@Override
void role() {
    System.out.println("I am a father");
}
}
 */
//--------------------------------------------------------------------------

//Run-Time Polymorphism
//Method Overriding
public class PolyMorphism {

    public static void main(String args[]) {
        Animal animal = new Animal();
        Deer deer = new Deer();
        deer.eat();
        animal.eat();
    }
}

class Animal {

    void eat() {
        System.out.println("Eat Anything");
    }
}

class Deer extends Animal {

    void eat() {
        System.out.println("Eat Grass");
    }
}
