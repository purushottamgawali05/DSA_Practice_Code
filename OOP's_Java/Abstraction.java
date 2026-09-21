/*
public class Abstraction {
    
public static void main(String args[]) {
    Horse horse = new Horse();
    horse.eat();//eat
    horse.walk();//4 legs
    System.out.println(horse.color);
    
    // Chicken chicken = new Chicken();
    // chicken.eat();//eats
    // chicken.walk();//2 legs
}
}

abstract class Animal {
    
String color;

Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("eats");
    }
    
    abstract void walk();
}

class Horse extends Animal {
    
void changeColor() {
    color = "dark brown";
}

void walk() {
    System.out.println("Walks on 4 legs");
}
}

class Chicken extends Horse {
    
void walk() {
    System.out.println("Walks on 2 legs");
}
}
*/


//constructor calling hierarchy
public class Abstraction{
    public static void main(String args[]){
        Mustang m = new Mustang();
    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}