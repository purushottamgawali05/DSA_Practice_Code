// "static void main" must be defined in a public class.

public class Assignment {

    public void countingSort(int arr[]) {
        System.out.println("I am counting sort");

        int largest = Integer.MIN_VALUE;

        //finding largest element
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        //creating new array of size largest+1
        int count[] = new int[largest + 1];

        //storing frequency of each element 
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public void bubbleSort(int arr[]) {
        System.out.println("I am bubble sort");
        //number of turns
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //swap
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] arr) {
        System.out.println("I am selection sort");
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public void insertionSort(int arr[]) {
        System.out.println("I am insertion sort");

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //swap
            arr[prev + 1] = curr;
        }
    }

    public void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Assignment m = new Assignment();
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        m.countingSort(arr);
        // m.bubbleSort(arr);
        // m.selectionSort(arr);
        // m.insertionSort(arr);
        m.printArr(arr);

    }
}
