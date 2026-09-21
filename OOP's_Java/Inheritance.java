//Single or Simple Inheritance

/*
public class Inheritance {
    public static void main(String args[]){
        
    Fish shark = new Fish();
    
    shark.eat();
    shark.swim();
    shark.skinColor = "blue";
    System.out.println(shark.skinColor);
    
    
    
}
}

class Animal{
    String skinColor;
    
    void eat(){
        System.out.println("I like eating mango");
    }
    
    void breath(){
        System.out.println("Every animal takes breath");
    }
}

class Fish extends Animal{
    
    int fins;
    
    void swim(){
        System.out.println("I like swimming");
    }
}

*/

//----------------------------------------------------------------------------------------------------


/*
//Multiple Inheritance
public class Inheritance{
    public static void main(String args[]){

    Dog dog = new Dog();
    dog.work();//security
    dog.legs();//4
    dog.habitant();//water
    
    Mammals mammals = new Mammals();
    mammals.type();//herbivorous
    
}
}

class Animal{
    String name;
    
    void habitant(){
        System.out.println("Water");
    }
    
    void type(){
        System.out.println("Herbivorous");
    }
}


class Mammals extends Animal{
    String name;
    
    void legs(){
        System.out.println(4);
    }
}


class Dog extends Mammals{
    String breed;
    
    void work(){
        System.out.println("Security");
    }
}

*/

//-------------------------------------------------------------------------

public class Inheritance{
    public static void main(String args[]){
        Mammals mammal = new Mammals();
        mammal.walk();//walk
        mammal.living();//living

        Fish fish = new Fish();
        fish.swim();//swim
        fish.living();//living

        Bird bird = new Bird();
        bird.color = "Red";
        System.out.println(bird.color);//red
        bird.fly();//fly
        bird.living();//living
    }
}

class Animal{
    String name;
    void living(){
        System.out.println("Living");
    }
}

class Mammals extends Animal{
    String habitant;
    void walk(){
        System.out.println("Walk");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    String color;
    void fly(){
        System.out.println("Fly");
    }
}