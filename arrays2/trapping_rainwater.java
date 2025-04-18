// Trapping Rainwater
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
public class trapping_rainwater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
            }
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;
        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                    } else {
                        waterTrapped += leftMax - height[left];
                        }
                left++;
                } else {
                    if (height[right] >= rightMax) {
                        rightMax = height[right];
                        } else {
                            waterTrapped += rightMax - height[right];
                            }
                    right--;
                    }
                    }
        return waterTrapped;
        }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Water trapped: " + trap(height));
        }
        
   


        
    
}
