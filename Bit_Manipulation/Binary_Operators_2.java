
public class Binary_Operators_2 {

    public boolean isPower(int n) {
        return (n & (n - 1)) == 0;
    }

    public int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }


    //fast exponentiation
    public int fastExpo(int n, int a){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
                System.out.println(ans);
            }
            a *= a;
            System.out.println("a " + a);
            n = (n >> 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Binary_Operators_2 BO = new Binary_Operators_2();

        // int n = 3, a = 5;//3^5
        int n = 5, a = 3;
        // System.out.println(BO.isPower(n));
        // System.out.println(BO.countSetBits(n));
        System.out.println(BO.fastExpo(n, a));


    }
}
