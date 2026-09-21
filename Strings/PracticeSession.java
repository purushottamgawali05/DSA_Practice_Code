public class PracticeSession {
    
    public static void main(String args[]){

        PracticeSession PS = new PracticeSession();

        // System.out.println(PS.asciiLearn(ch));

        char ch = 'A';
        System.out.println((int) ch); // 65

        int val1 = 66;
        System.out.println((char) val1); //B

        System.out.println('A' + 'B'); //131
        System.out.println('0' + 0); //48
        System.out.println('0' == 0); //false
        System.out.println('B' - 'A'); //1
        System.out.println('B' - 'A' == 1); //true
        System.out.println("A" + "B"); //AB
        System.out.println('A' + 'B' + "C" + 'D' + 'E'); //131CDE

        boolean result = (ch >= 'a' && ch <= 'z')? true: false;
        System.out.println(result); //true

        char upper = Character.isLowerCase(ch)? (char)(ch - 'a' + 'A'): ch;
        System.out.println(upper);//A

    }
}
