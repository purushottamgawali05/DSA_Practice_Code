
// public class TowerHanoi {
//     public static void helper(int n, int from, int to, int aux, int count) {
//         if (n == 0) {
//             return;
//         }
//         helper(n - 1, from, aux, to, count);
//         count++;
//         helper(n - 1, aux, to, from, count);
//     }
//     public static int towerofHanoi(int n, int from, int to, int aux) {
//         int count = 0;
//         helper(n, from, to, aux, count);
//         return count;
//     }
//     public static void main(String Tower[]) {
//         int n = 3;
//         System.out.println(towerofHanoi(n, 3, 0, 0));
//     }
// }
public class TowerHanoi {

    public static int helper(int n, int from, int to, int aux) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        count += helper(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        count++;
        count += helper(n - 1, aux, to, from);
        return count;
    }

    public static int towerofHanoi(int n, int from, int to, int aux) {
        return helper(n, from, to, aux);
    }

    public static void main(String[] args) {
        int n = 4;
        int moves = towerofHanoi(n, 1, 3, 2);
        System.out.println("Total moves: " + moves);
    }
}
