package sorting;

public class bubblesort {
    // Function to perform bubble sort on an array
    public static void bubbleSort(int[] arr) {
       for (int i = 0; i < arr.length - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Traverse the array from 0 to n-i-1
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
                      
    }

    // Main method to test the bubble sort function
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        bubbleSort(arr);
    }
        
    
    
}
