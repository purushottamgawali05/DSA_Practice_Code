public class StaticKeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "BSMVN";
        Student s2 = new Student();
        s2.schoolName = "Deogiri";

        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}