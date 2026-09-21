
public class HybridInheritance {

    public static void main(String args[]) {
        Mammals mammal = new Mammals();
        mammal.living();

        Bird bird = new Bird();
        bird.living();

        Fish fish = new Fish();
        fish.living();

        Cat cat = new Cat();
        cat.living();
    }
}

class Animal {

    String category;

    void living() {
        System.out.println("Living");
    }
}

class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swim");
    }
}

class Tuna extends Fish {

    void tuna() {
        System.out.println("Tuna");
    }
}

class shark extends Fish {

    void danger() {
        System.out.println("Danger");
    }
}

class Mammals extends Animal {

    void gland() {
        System.out.println("Gland");
    }
}

class Dog extends Mammals {

    void bark() {
        System.out.println("Bark");
    }
}

class Cat extends Mammals {

    void meow() {
        System.out.println("meow");
    }
}

class Human extends Mammals {

    void smart() {
        System.out.println("Smart");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("fly");
    }
}

class Peacock extends Bird {

    void dance() {
        System.out.println("Feathers");
    }
}
