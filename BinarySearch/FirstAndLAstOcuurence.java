// First and last occurrences

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If the target is not found in the array, return [-1, -1].

public class FirstAndLAstOcuurence {

      public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    // Function to find the first occurrence
    private int findFirst(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        int first = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                first = mid;        // possible first index
                end = mid - 1;      // look more on the left side
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    // Function to find the last occurrence
    private int findLast(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        int last = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                last = mid;         // possible last index
                st = mid + 1;       // look more on the right side
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
    
}
