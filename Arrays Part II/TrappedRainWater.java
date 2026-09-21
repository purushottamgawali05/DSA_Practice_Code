
// public class TrappedRainWater {
//     public static int TrappedRainWaterinbar(int height[]) {
//         int n = height.length;
//         int trappedwater = 0;
//         //leftmax
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(height[i], leftmax[i - 1]);
//         }
//         //right
//         int rightmax[] = new int[n];
//         rightmax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightmax[i] = Math.max(height[i], rightmax[i + 1]);
//         }
//         //loop
//         for (int i = 0; i < n; i++) {
//             //waterlevel
//             int waterlevel = Math.min(leftmax[i], rightmax[i]);
//             trappedwater += waterlevel - height[i];
//         }
//         return trappedwater;
//     }
//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println("The Trapped Water is: " + TrappedRainWaterinbar(height));
//     }
// }
//------------------------------------------------------------------------------------------
public class TrappedRainWater {

    public int rainTrapped(int height[]) {
        int trappedWater = 0;
        int n = height.length;

        //leftMax array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        for (int i = 0; i < leftMax.length; i++) {
            System.out.print(leftMax[i] + " ");
        }
        System.out.println();
        //rightMax array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 0; i < rightMax.length; i++) {
            System.out.print(rightMax[i] + " ");
        }
        System.out.println();
        //trappedWater
        for (int i = 0; i < n; i++) {
            int min = Math.min(rightMax[i], leftMax[i]);
            int Water = min - height[i];
            System.out.println(Water);
            trappedWater += Water;
            System.out.println(trappedWater);
        }
        return trappedWater;
    }

    public static void main(String water[]) {
        TrappedRainWater rain = new TrappedRainWater();

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        // int height[] = {10, 2, 7};
        System.out.println("The trapped rain water is: " + rain.rainTrapped(height));

    }
}
