
public class superKey {
    public static void main(String args[]) {
        Mammal m = new Mammal();
        System.out.println(m.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("I like eating banana");
    }
}

class Mammal extends Animal {
    Mammal() {
        super.color = "brown";
        System.out.println("I have 2 legs");
    }
}
