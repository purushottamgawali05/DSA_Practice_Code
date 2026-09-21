
import java.util.ArrayList;
import java.util.Collections;

public class PairSum1 {

    //brute force
    public static void pairS(ArrayList<Integer> list, int[] arr, int target) {
        for (int idx1 = 0; idx1 < list.size(); idx1++) {
            for (int idx2 = idx1 + 1; idx2 < list.size(); idx2++) {
                if ((list.get(idx1) + list.get(idx2)) == target) {
                    arr[0] = list.get(idx1);
                    arr[1] = list.get(idx2);
                    return;
                }
            }
        }
    }

    //Optimize Pair Sum 1 => Two Pointer Approach
    public static void pairSumOptimize(ArrayList<Integer> list, int[] arr, int target) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                arr[0] = list.get(left);
                arr[1] = list.get(right);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String Pair[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int target =10;

        //Brute Force
        // pairS(list, arr, target);
        //Optimized => Need Sorted array
        Collections.sort(list);

        pairSumOptimize(list, arr, target);

        System.out.println(arr[0] + " " + arr[1]);
    }
}
