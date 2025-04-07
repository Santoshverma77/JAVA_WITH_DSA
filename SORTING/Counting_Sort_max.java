package SORTING;
import java.util.Arrays;



public class Counting_Sort_max {
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
            }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
        
        }
        
     

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 2, 7, 5, 2 };
        countingsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public Counting_Sort_max() {
    }
}
// Time Complexity: O(n + k) where n is the number of elements in the array and k is the range of the input
