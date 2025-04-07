public class max_subarrays_sum {
    // Function to find the maximum subarray sum using Kadane's algorithm
     
    public static int maxSubArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers [i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,};
        System.out.println("Maximum contiguous sum is: " + maxSubArraySum(numbers));
    }
}
