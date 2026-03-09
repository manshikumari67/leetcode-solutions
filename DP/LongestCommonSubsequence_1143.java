package DP;

// 1143. Longest Common Subsequence

// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

public class LongestCommonSubsequence_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
       int m=text1.length(), n= text2.length();
       int[][] dp=new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
       }
       return LCS(m-1,n-1,new StringBuilder(text1),new StringBuilder(text2),dp);
    }

    private static int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp ){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=1+LCS(i-1,j-1,a,b,dp);
        else return dp[i][j]=Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
    }
}
