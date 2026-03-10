package DP;

// 516. Longest Palindromic Subsequence

// Given a string s, find the longest palindromic subsequence's length in s.
// A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

public class LongestPalindromeSubsequence_516 {
       public int longestPalindromeSubseq(String s) {
      StringBuilder a=new StringBuilder(s);
      StringBuilder b=new StringBuilder(s); 
      b.reverse();
      return lcs(a,b); 
    }
     public int lcs(StringBuilder text1, StringBuilder text2) {
       int m=text1.length(), n= text2.length();
       int[][] dp=new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
       }
       return LCS(m-1,n-1,text1,text2,dp);
    }

    public int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp ){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=1+LCS(i-1,j-1,a,b,dp);
        else return dp[i][j]=Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
    }
}
