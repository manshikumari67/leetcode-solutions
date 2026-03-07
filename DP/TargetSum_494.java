package DP;

// 494. Target Sum

//You are given an integer array nums and an integer target.
// You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
// For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
// Return the number of different expressions that you can build, which evaluates to target.

  

public class TargetSum_494 {
     int totalSum = 0;
    Integer[][] dp;

    public int findTargetSumWays(int[] nums, int target) {

        for(int num : nums) {
            totalSum += num;
        }

        dp = new Integer[nums.length][2 * totalSum + 1];

        return solve(nums, 0, 0, target);
    }

    public int solve(int[] nums, int i, int sum, int target) {

        if(i == nums.length){
            if(sum == target) return 1;
            return 0;
        }

        if(dp[i][sum + totalSum] != null){
            return dp[i][sum + totalSum];
        }

        int add = solve(nums, i + 1, sum + nums[i], target);
        int subtract = solve(nums, i + 1, sum - nums[i], target);

        dp[i][sum + totalSum] = add + subtract;

        return dp[i][sum + totalSum];
    }
}
