// public class Constructors1 {
//     public static void main(String args[]){
//         //types of constructors
//         //parametirized
//         Student s1 = new Student("Purushottam");
//         Student s3 = new Student(34);
//         //non - parametirized
//         Student s2 = new Student();
//     }
// }

// class Student{
//     String name;
//     int rollNo;
//     //Constructor Overloading
//     //non - parametirized
//     Student(){
//         System.out.println("Constructor has called...");
//     }
//     //parametirized
//     Student(String name){
//         this.name = name;
//         System.out.println(name);
//     }
//     //parametirized
//     Student(int rollNo){
//         this.rollNo = rollNo;
//         System.out.println(rollNo);
//     }
// }
//-----------------------------------------------------------------


//Learning Copy Constructor
public class Constructors1 {

    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Purushottam";
        s1.rollNo = 123;
        s1.password = "1234";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.password = "987450";

        System.out.println(s1.marks[2]);
        
        s2.marks[2] = 8;
        System.out.println(s2.marks[2]);

        System.out.println(s2.password);
        
        //all the arr elements of s1 will get copied in s2 because array always passed by the reference
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
        
    }
}

class Student {
    
    String name;
    int rollNo;
    String password;
    int marks[];
    
    // shallow copy constructor
    // Student(Student s1) {
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.rollNo = s1.rollNo;
        //     this.password = s1.password;
        //     this.marks = s1.marks;
        // }
        
        
        // Deep Copy constructor
        Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.rollNo = s1.rollNo;
            this.password = s1.password;
            for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor has called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
        System.out.println(name);
    }

    Student(int rollNo) {
        marks = new int[3];
        this.rollNo = rollNo;
        System.out.println(rollNo);

    }
}
