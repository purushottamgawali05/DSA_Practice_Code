
public class QuickSort {

    //Prints the array elements
    public static void print(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int istIdx = si - 1;

        //Swap adjcent greater and smaller elements
        //smaller => left side of pivot
        //larger => right side of pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                istIdx++;
                //swap
                int temp = arr[j];
                arr[j] = arr[istIdx];
                arr[istIdx] = temp;
            }
        }

        //Put the pivot at its appropriate position
        istIdx++;
        int temp = pivot;
        arr[ei] = arr[istIdx];
        arr[istIdx] = temp;

        //returns the index of pivot
        return istIdx;
    }

    //quickSort method that divides the array
    public static void quickSort(int[] arr, int si, int ei) {
        //base case
        if (si >= ei) {
            return;
        }

        //Returns the pivot index (last element of the array)
        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1); //left part  
        quickSort(arr, pIdx + 1, ei); //right part
    }

    //Main method calling quickSort and print method
    public static void main(String args[]) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
