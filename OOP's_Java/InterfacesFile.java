/*
// Abstraction using Interfaces
public class InterfacesFile {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        
        ChessPlayer a = new Queen();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right. diagonally (all directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");   
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right. diagonally (by 1 step)");
    }
}

class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("up, down");
    }
}
*/

public class InterfacesFile{
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.meat();
    }
}

interface Herbivore{
    // String name;
    void eat();
}

interface Carnivore{
    void meat();
}

class Bear implements Herbivore, Carnivore{
   public void meat(){
        System.out.println("eat meat");
    }

    public void eat(){
        System.out.println("eat grass");
    } 
}