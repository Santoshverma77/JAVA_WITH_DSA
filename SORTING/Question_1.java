//use the following sorting algorithm to sort an array in descending order
// a. bubble sort
// b. selection sort
// c. insertion sort
// d. counting sort
// you can use this array as an example { 3,6,2,1,8,7,4,5,3,1,}
public class Question_1 {
    // Bubble sort algorithm
    public static void bubbleSortDecending (int[] array) {
        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int i = 0; i < array.length - 1 - turn; i++) {
                if (array[i] < array[i + 1]) {
                    // Swap
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            }
        }
    
        public static void selectionsortDecending(int arr[]) {
            for (int turn = 0; turn < arr.length - 1; turn++) {
                int maxIndex = turn;
                for (int i = turn + 1; i < arr.length; i++) {
                    if (arr[i] > arr[maxIndex]) {
                        maxIndex = i;
                    }
                }
                // Swap
                int temp = arr[turn];
                arr[turn] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
      public static void insertionSortDecending(int arr[]) {
             for (int i = 1; i < arr.length; i++) {  
        int key = arr[i];
        int j = i - 1;
        // Move elements of arr[0..i-1], that are less than key,
        // to one position ahead of their current position
        while (j >= 0 && key > arr[j]) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

   public static void countingsortDecending(int arr[]) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    int count[] = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }
    int index = 0;
    for (int i = count.length - 1; i >= 0; i--) {
        while (count[i] > 0) {
            arr[index++] = i;
            count[i]--;
        }
        }
    }
    public static void main(String[] args) {
        System.out.println("Sorting the array in descending order using bubble sort");
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // Bubble sort
        bubbleSortDecending(arr);
        // Selection sort
        // selectionsortDecending(arr);
        // Insertion sort
        // insertionSortDecending(arr);
        // Counting sort
        // countingsortDecending(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       
        
    }
}
