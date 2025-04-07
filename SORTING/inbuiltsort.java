package SORTING;
import java.util.Arrays;
// This class demonstrates the use of built-in sorting method in Java

public class inbuiltsort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        // Using built-in sort method from Arrays class
        Arrays.sort(arr);
        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }


    
}


