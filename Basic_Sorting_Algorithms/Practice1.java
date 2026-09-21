
public class Practice1 {

    /* 
    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
            }
        }
    }
     */

    /*
    public static void Selection(int arr[]) {
        
    for (int i = 0; i < arr.length - 1; i++) {
        int smallest = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] > arr[smallest]) {
                smallest = j;
            }
        }
        
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
}
*/

/*
public static void Insertion(int arr[]){
    for(int i=1; i<arr.length; i++){
        int cuur = arr[i];
        int prev = i - 1;
        
        while(prev >= 0 && arr[prev] < cuur ){
            arr[prev + 1] = arr[prev];
            prev--;
        }
        arr[prev+1] = cuur;
    }
}

*/      

    public static void CountingSort(int arr[]){
        
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int [] count = new int[largest + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
        }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // BubbleSort(arr);
        // Selection(arr);
        // Insertion(arr);
        CountingSort(arr);
        print(arr);
    }
}
//8 7 6 5 4 3 3 2 1 1 
