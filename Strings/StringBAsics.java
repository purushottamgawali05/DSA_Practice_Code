
public class StringBAsics {

    /*
    
    public static boolean IsLowerCase(char ch3) {
        return ch3 >= 'a' && ch3 <= 'z';
    }
    
    public static char IsUpperCase(char ch3) {
        if (!IsLowerCase(ch3)) {
            return ch3;
        } else {
            return (char) (ch3 - 32);
    }
}
     */
    public static void main(String Base[]) {
        /* 
    
char ch3 = 'c';
System.out.println(IsLowerCase(ch3));

System.out.println(IsUpperCase(ch3));

char ch1 = 'A';
System.out.println((int) ch1);//65

char ch2 = '#';
System.out.println((int) ch2);//65

int val1 = 66;
System.out.println((char) val1);//B

System.out.println('A' + 'B');//131
System.out.println('0' == 0);//false
System.out.println('B' - 'A' == 1);//true
System.out.println("A" + "B");//AB
System.out.println('A' + 'B' + "C" + 'D' + 'E');//"131C" + 'D' + 'E' => 131CDE

         */

        String s1 = "Amaravati";
        String s2 = "Amaravati";
        String s3 = "Nanded";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println();

        String s11 = new String("Malegaon");
        String s22 = new String("Washim");
        String s33 = new String("Malegaon");

        System.out.println(s11 == s22);
        System.out.println(s11 == s33);
        System.out.println(s11.equals(s22));
        System.out.println(s11.equals(s22));

    }
}
