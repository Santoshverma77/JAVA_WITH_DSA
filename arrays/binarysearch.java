// package arrays;

public class  binarysearch  {

    public static int function(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == key) {
                return mid;  x
            }
            if (arr[mid] < key) {
                start = mid + 1;  
            } else {
                end = mid - 1; 
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 8, 9, 10, 20};
        int key = 4;
        
        int result = function(arr, key);
        System.out.println("Index of key: " + result);  
    }
}
