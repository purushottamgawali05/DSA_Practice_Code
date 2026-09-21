
public class Binary_Operators {

    public void OddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public int ithBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        return 1;
    }

    public int setithBit(int n, int i) {
        int bitmask = (1 << i);
        return n | bitmask;
    }

    public int clearithBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public int updateithBit(int n, int i, int newBit) {
        // if(newBit == 0){
        //     return clearithBit(n, i);
        // }else{
        //     return setithBit(n, i);
        // }

        n = clearithBit(n, i);
        int Bitmask = (newBit << i);
        return n | Bitmask;
    }

    public int clearLastBit(int n) {
        int bitmask = ~(1 << 0);
        return n & bitmask;
    }

    public int clearLastithBit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String args[]) {
        Binary_Operators BO = new Binary_Operators();

        // System.out.println("Binary AND: " + (-5 & 6));
        // System.out.println("Binary OR: " + (5 | 6));
        // System.out.println("Binary XOR: " + (5 ^ 6));
        // System.out.println("Binary Complement: " + (~5));
        // System.out.println("0's Complement: " + (~0));
        // System.out.println("Binary Right Shift: " + (5 >> 2));//3
        // System.out.println("Binary Left Shift: " + (6 << 1));//20
        int n = 10, i = 2, newBit = 1, j = 4;
        // BO.OddEven(n);
        // System.out.println(BO.ithBit(n, i));
        // System.out.println(BO.setithBit(n, i));
        // System.out.println(BO.clearithBit(n, i));    
        // System.out.println(BO.clearLastBit(n));    
        // System.out.println(BO.updateithBit(n, i, newBit));
        // System.out.println(BO.clearLastithBit(n, i));    
        System.out.println(BO.clearBitsInRange(n, i, j));

    }
}
