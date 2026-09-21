
public class DeOrder {

//n to 1 numbers in decreasing order
    public static void order(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        order(num - 1);
    }

//n to 1 numbers in increasing order
    public static void OrderInc(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        OrderInc(num - 1);
        System.out.print(num + " ");
    }

//factorial of a number
    public static int fact(int num) {
        if (num == 1) {
            return num;
        }
        return num * fact(num - 1);
    }

//sum of n natural numbers
    public static int sum(int num) {
        if (num == 1) {
            return num;
        }
        return num + sum(num - 1);
    }

//Nth fibonacci series
    public static int Fibo(int num) {

        if (num == 0 || num == 1) {
            return num;
        }

        int fibnum_1 = Fibo(num - 1);
        int fibnum_2 = Fibo(num - 2);

        return fibnum_1 + fibnum_2;

    }

//Check given array is sorted or not
    public static boolean Sorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return Sorted(arr, i + 1);
    }

//Write a function to find it's first occurence in an array
    public static int Occurence(int arr[], int i, int key) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return Occurence(arr, i + 1, key);
    }

//Write a function to find it last occurence of a number in an array
    public static int LastOcc(int arr[], int i, int key) {

        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return LastOcc(arr, i - 1, key);
    }

//Write a function to find it last occurence of a number in an array
    public static int LastOccNew(int arr[], int i, int key) {

        // if (i == arr.length) {
        //     return -1;
        // }
        // int isFound = LastOccNew(arr, i + 1, key);
        // if (arr[i] == key && isFound == -1) {
        //     return i;
        // }
        // return isFound;
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccNew(arr, i + 1, key);
        if (arr[i] == key && isFound == -1) {
            return i;
        }
        return isFound;
    }

//power x^n
    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Power(x, n - 1);
    }

//optimized power x^n code
    public static int PowerOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = PowerOptimized(x, n/2);
        int halfpowersq =  halfpower *  halfpower;
        if(n%2 != 0){
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String Decreasing[]) {
        // int num = 25;
        // int arr[] = {1, 2, 3, 4, 3, 5, 8, 10, 5};
        // int i = 0;
        // int key = 20;
        // order(num);
        // OrderInc(num);
        // System.out.println(fact(num));
        // System.out.println(sum(num));
        // System.out.println(Fibo(num));
        // System.out.println(Sorted(arr, i));
        // System.out.println(Occurence(arr, i, key));

        // int arr[] = {1, 2, 3, 4, 3, 5, 8, 10, 5};
        // int i = arr.length - 1;
        // int key = 3;
        // System.out.println(LastOcc(arr, i, key));
        // int arr[] = {1, 2, 3, 4, 3, 5, 8, 10, 5};
        // int i = 0;
        // int key = 3;
        // System.out.println(LastOccNew(arr, i, key));
        int x = 2;
        int n = 5;
        // System.out.println(Power(x, n));

        System.out.println(PowerOptimized(x, n));
    }
}
