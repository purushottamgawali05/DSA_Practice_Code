
public class RotatedSorted {

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[ei]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 5, 1, 2};
        System.out.println(search(arr, 0, 0, arr.length - 1));
    }
}
//===========================================================================================

/*
public class RotatedSorted {
  
public static int search(int arr[], int tar, int si, int ei) {
  
while (si <= ei) {
  
int mid = si + (ei - si) / 2;

if (arr[mid] == tar) {
  return mid;
}

            if (arr[si] <= arr[mid]) {
                if (arr[si] <= tar && tar <= arr[ei]) {
                    ei = mid - 1;
                    
                } else {
                    si = mid + 1;
                  
                }
              } else {
                if (arr[mid] <= tar && tar <= arr[ei]) {
                    si = mid + 1;
                   
                  } else {
                    ei = mid - 1;
                  
                }
              }
            }
            
            return -1;
          }
          
          public static void main(String args[]) {
            int arr[] = {4, 5, 6, 7, 5, 1, 2};
        System.out.println(search(arr, 1, 0, arr.length - 1));
    }
  }
  
  */
