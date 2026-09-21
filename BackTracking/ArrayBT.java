public class ArrayBT{
  public static void changeArr(int arr[], int idx, int val){
    //base
    if(idx == arr.length){
      printArr(arr);
      return;
    }

    //recursion
    arr[idx] = val;
    changeArr(arr, idx+1, val+1);
    arr[idx] = arr[idx] - 2;
  }
  public static void printArr(int arr[]){
    for(int idx = 0; idx < arr.length; idx++){
      System.out.print(arr[idx] + " ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    int arr[] = new int[5];
    changeArr(arr, 0, 1);
    printArr(arr);
  }
}