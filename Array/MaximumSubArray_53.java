package Array;

// 53. Maximum Subarray

// Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class MaximumSubArray_53 {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}
