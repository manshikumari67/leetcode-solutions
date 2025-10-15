package Array;

public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
      int n = nums.length;
        if (n < 2) return -1; // not enough elements

        int maxElement = Integer.MIN_VALUE;
        int secMaxElement = Integer.MIN_VALUE;

        // Find the largest element
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }

        // Find the second largest element
        for (int i = 0; i < n; i++) {
            if (nums[i] != maxElement && nums[i] > secMaxElement) {
                secMaxElement = nums[i];
            }
        }

        // If second largest not found, return -1
        if (secMaxElement == Integer.MIN_VALUE) {
            return -1;
        }

        return secMaxElement;
    }
}
