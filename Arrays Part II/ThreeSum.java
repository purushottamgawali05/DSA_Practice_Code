/*
    Question 5:Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.Example 1:Input:nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]3210purushottamgawali2004@gmail.com
Example 2:Input:nums = [ ]  Output:   [ ]  Example 3:Input:nums = [ 0   ]  Output:   [ ]  Constraints:•0   <= nums . length <= 3000 •-105 <= nums [ i ] <= 10
 */

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int arr[]) {

        int n = arr.length;

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String sum[]) {

        ThreeSum three = new ThreeSum();

        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(three.threeSum(arr));
    }
}
