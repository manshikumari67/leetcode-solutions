package DP;

import java.util.Arrays;

// 746. Min Cost Climbing Stairs

// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
// You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.

 

public class MInCostClimbingStairs_746 {
    static int[] dp;
    
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(0,cost),minCost(1,cost));

    }
    
    private static int minCost(int i, int[] cost){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=cost[i] +Math.min(minCost(i+1,cost),minCost(i+2,cost));
    }
}
