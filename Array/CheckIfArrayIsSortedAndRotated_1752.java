package Array;

// 1752. Check if Array Is Sorted and Rotated

// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
// There may be duplicates in the original array.
// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

public class CheckIfArrayIsSortedAndRotated_1752 {
    
    static void swapArray(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swapArray(nums, i, j);
            i++;
            j--;
        }
    }

    public boolean check(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                reverse(nums, 0, i - 1);
                reverse(nums, i, n - 1);
                reverse(nums, 0, n - 1);
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;

    }
}
