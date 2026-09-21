
public class OOP {

    public static void main(String[] oops) {
        //object of a Pen class created p1
        Pen p1 = new Pen();

        //function call with parameters
        p1.setColor("orange");
        System.out.println(p1.color);

        p1.setTipSize(5);
        System.out.println(p1.tipSize);

        p1.color = "green";
        System.out.println(p1.color);

//------------------------------------------------------------------------------        
    //Learning Access Modifiers
    BankAcc Acc = new BankAcc();

    Acc.userName = "Purushottam";
    System.out.println(Acc.userName);

    // Acc.password = "123458"; --> we can't access password outside of the class because it is private

    Acc.setPassword("123654789");

    }
}

class Pen {

    //properties of an object
    String color;
    int tipSize;

    //functions of a class
    void setColor(String newColor) {
        color = newColor;
    }

    void setTipSize(int newTipSize) {
        tipSize = newTipSize;
    }
}

//Access Modifiers
class BankAcc{
   public String userName;
   private String password;
   
   public void setPassword(String pwd){
       password = pwd;
       System.out.println(password);
}
}


class Student{
    String name;
    int rollNo;
    String standard;

}
