
// /* 
// public class BubbleSort {
// public static void BubbleSortLogic(int arr[]) {
// for (int turn = 0; turn < arr.length - 1; turn++) {
//     for (int j = 0; j < arr.length - 1 - turn; j++) {
//     if (arr[j] > arr[j + 1]) {
//     int temp = arr[j];
//     arr[j] = arr[j + 1];
//     arr[j + 1] = temp;
// }
// }
// }
// }
// public static void PrintBubbleSort(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }
// public static void main(String args[]) {
//     int arr[] = {5, 4, 1, 3, 2};
//     BubbleSortLogic(arr);
//     PrintBubbleSort(arr);
// }
// }
// //1 2 3 4 5 
//  */
//  /*
// public class BubbleSort {
// public static void BubbleSortLogic(int arr[]) {
// for (int turn = 0; turn < arr.length - 1; turn++) {
//     int swap = 0;
//     for (int j = 0; j < arr.length - 1 - turn; j++) {
//     if (arr[j] > arr[j + 1]) {
//     int temp = arr[j];
//     arr[j] = arr[j + 1];
//     arr[j + 1] = temp;
//     swap++;
// }
// }
// if (swap == 0) {
//     System.out.println("The array is already sorted");
//     break;
// }
// }
// }
// public static void PrintBubbleSort(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }
// public static void main(String args[]) {
//     int arr[] = {1, 2, 3, 4, 5};
//     BubbleSortLogic(arr);
//     PrintBubbleSort(arr);
// }
// }
//  */
// public class BubbleSort {
//     public static void BubbleSortLogic(int arr[]) {
//         for (int turn = 0; turn < arr.length - 1; turn++) {
//             int swap = 0;  // reset swap count for each pass
//             for (int j = 0; j < arr.length - 1 - turn; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swap++;
//                 }
//             }
//             // ✅ Check after completing one full pass
//             if (swap == 0) {
//                 System.out.println("The array is already sorted");
//                 break;
//             }
//         }
//     }
//     public static void PrintBubbleSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 9, 5};
//         BubbleSortLogic(arr);
//         PrintBubbleSort(arr);
//     }
// }
// [3,6,2,1,8,7,4,5,3,1]
public class BubbleSort {

    public static void Sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        Sort(arr);
        Print(arr);

    }
}
//8 7 6 5 4 3 3 2 1 1 
