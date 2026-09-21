// "static void main" must be defined in a public class.

import java.util.*;

public class Assignment {

    // dublicate present or not if present -> true else false
    public boolean hasDublicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

//     //return target element is present in the array or not if yes return index else -1
    public int rotatedSort(int nums[], int target) {
        int left = 0, right = nums.length - 1, mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > nums[left]) {
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] > target && target < nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

//     //return max profit from share market
    public int maxProfitstock(int nums[]) {
        int minPrice = nums[0];
        int maxProfit = Integer.MIN_VALUE;

        for (int sell = 1; sell < nums.length; sell++) {
            minPrice = Math.min(minPrice, nums[sell]);
            maxProfit = Math.max(maxProfit, nums[sell] - minPrice);
        }
        return maxProfit;
    }

//     //return total water trapped in between the bars;
    public int waterTrapped(int height[]) {

        int n = height.length;
        //leftmax array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        //rightmax array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }

        //total water trapped
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int minH = Math.min(leftmax[i], rightmax[i]);
            totalWater += minH - height[i];
        }
        return totalWater;
    }

    //written three 3 elements whose sum = 0;
    public List<List<Integer>> threeSumProblem(int nums[]) {
        int n = nums.length;

        Set<List<Integer>> result = new HashSet<>();

        //brute force approach
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Assignment m = new Assignment();

        // int nums[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        // int height[] = {4, 2, 0, 3, 2, 5};
        int nums[] = {-1, 0, 1, 2, -1, -4};
        // int target = 1;

        // System.out.println(m.hasDublicate(nums));
        // System.out.println(m.rotatedSort(nums, target));
        // System.out.println(m.maxProfitstock(nums));
        // System.out.println(m.waterTrapped(height));
        System.out.println(m.threeSumProblem(nums));

    }
}
