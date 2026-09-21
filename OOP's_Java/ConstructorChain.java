
public class ConstructorChain {

    public static void main(String args[]) {
        Chain c = new Chain();
    }
}

class Parent {
    Parent() {
        System.out.println("this is the constructor from parent class");
    }
}

class Chain extends Parent {

    Chain() {
        this(5);
        System.out.println("This is the default constructor");
    }

    Chain(int i) {
        this("hello");
        System.out.println("this is the int constructor");
    }

    Chain(String s) {
        super();
        System.out.println("this is the string constructor");

    }

}
