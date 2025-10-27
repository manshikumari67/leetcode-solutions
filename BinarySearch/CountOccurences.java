package BinarySearch;

// Count Occurrences in a Sorted Array

// You are given a sorted array of integers arr and an integer target. Your task is to determine how many times target appears in arr.
// Return the count of occurrences of target in the array.

public class CountOccurences {

     public int countOccurrences(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(arr, target);
        ans[1] = findLast(arr, target);

        int count = 0;
        if (ans[0] != -1 && ans[1] != -1) {
            count = ans[1] - ans[0] + 1;
        }

        return count;
    }

    private int findFirst(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        int first = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    private int findLast(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        int last = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                last = mid;
                st = mid + 1;
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
    
}
