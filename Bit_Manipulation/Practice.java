
public class Practice {

    public void Swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public int Add(int x) {
        x = (-~x);
        return x;
    }

    public void UpperToLower() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
        }
    }

    public static void main(String args[]) {
        Practice P = new Practice();

        int x = 6, y = 2;
        // P.Swap(x, y);
        // System.out.println(P.Add(x));
        P.UpperToLower();

    }
}
