package DP;

// 2742. Painting the Walls

// You are given two 0-indexed integer arrays cost and time, both of length n, where cost[i] and time[i] are the cost and time taken to paint the ith wall, respectively. You have to paint all n walls.

public class PaintingTheWalls_2742 {
      public int paintWalls(int[] cost, int[] time) {
     int n = cost.length;
     int[] dp = new int[n + 1];

     Arrays.fill(dp, (int) 1e9);
     dp[0] = 0;

     for(int i = 0; i < n; i++){
        int c = cost[i];
        int t = time[i];


       for(int j = n; j > 0; j--){

        int remainingWalls = Math.max(0, j - (1 + t));

        dp[j] = Math.min(dp[j] , dp[remainingWalls] + c);
       } 
     }
        return dp[n];
    }
}
