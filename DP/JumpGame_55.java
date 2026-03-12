package DP;

// 55. Jump Game
// Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

public class JumpGame_55 {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;     
    }
}
