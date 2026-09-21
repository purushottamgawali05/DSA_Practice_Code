
public class MergeSort {

    //Method to print all elements from the array
    public static void print(int arr[]) {
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }

    public static void mSort(int arr[], int si, int ei) {
        //base case
        if (si >= ei) {
            return;
        }
        //kaam
        //Find mid
        int mid = si + (ei - si) / 2;
        mSort(arr, si, mid); //Left Part
        mSort(arr, mid + 1, ei);//Right Part

        merge(arr, si, mid, ei); //merge
    }

    //Method to merge or add right and left part of the array into temp array
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; //Temperory array
        int leftIdx = si; //Left Part Iterator
        int rightIdx = mid + 1; // Right Part Iterator
        int tempIdx = 0; // Temp Array Iterator

        //Comparing and adding into temp array
        while (leftIdx <= mid && rightIdx <= ei) {
            if (arr[leftIdx] < arr[rightIdx]) {
                temp[tempIdx] = arr[leftIdx];
                leftIdx++;
            } else {
                temp[tempIdx] = arr[rightIdx];
                rightIdx++;
            }
            tempIdx++;
        }

        //Adding remaining Left Part Elements
        while (leftIdx <= mid) {
            temp[tempIdx] = arr[leftIdx];
            leftIdx++;
            tempIdx++;
        }

        //Adding remaining Right Part Elements
        while (rightIdx <= ei) {
            temp[tempIdx] = arr[rightIdx];
            rightIdx++;
            tempIdx++;
        }

        //Copy elements from temp array to original array
        leftIdx = si;
        tempIdx = 0;
        while (tempIdx < temp.length) {
            arr[leftIdx] = temp[tempIdx];
            leftIdx++;
            tempIdx++;
        }
    }

    public static void main(String sort[]) {
        //creating an array
        int[] arr = {6, 3, 9, 5, 2, 8};

        //Calling mSort method to divide the array
        mSort(arr, 0, arr.length - 1); 

        //Calling print method to print the elements
        print(arr);
    }
}
