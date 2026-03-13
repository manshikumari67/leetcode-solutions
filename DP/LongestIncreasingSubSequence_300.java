package DP;
import java.util.Arrays;

// 300. Longest Increasing Subsequence

// Given an integer array nums, return the length of the longest strictly increasing subsequence.

public class LongestIncreasingSubSequence_300 {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxlen=1;
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i] +=max;
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}
