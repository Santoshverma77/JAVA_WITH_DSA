public class prefix_maxsubarrays {
    // Function to find the maximum subarray sum using prefix sums
    public static int maxSubArraySum(int numbers[]) {
        int n = numbers.length;
        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + numbers[i - 1];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                maxSum = Math.max(maxSum, prefix[j] - prefix[i]);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {-1, 2, 3, -4, 5, -1};
        System.out.println("Maximum contiguous sum is: " + maxSubArraySum(numbers));
    }
    
}

//