
public class BinarySearchAlgo {

    public static void main(String args[]) {
        int numbers[] = {12, 3, 65, 47, 89};
        int key = 47;

        System.out.println("The index of the key is: " + FindNumByBinSearch(numbers, key));
    }

    public static int FindNumByBinSearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {

            //mid
            int mid = (start + end) / 2;

            //comparison
            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }

        return -1;
    }

}
