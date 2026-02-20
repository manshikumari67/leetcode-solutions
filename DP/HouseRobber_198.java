package DP;

import java.util.Arrays;

// 198.House Robber

// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

public class HouseRobber_198 {

     static int[] dp;

    public int rob(int[] arr) {

        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return loot(0,arr);
        
    }

    private int loot(int i, int[] arr){

        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=arr[i] + loot(i+2,arr);
        int skip=loot(i+1,arr);
        return dp[i]=Math.max(pick,skip);

    }
}
