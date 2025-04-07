package SORTING;

public class selectionsort {
    // Function to perform selection sort on an array
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the selection sort function
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        selectionSort(arr);
    }
    
}
