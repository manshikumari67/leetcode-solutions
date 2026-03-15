package DP;

// 1312. Minimum Insertion Steps to Make a String Palindrome

// Given a string s. In one step you can insert any character at any index of the string.
// Return the minimum number of steps to make s palindrome.
// A Palindrome String is one that reads the same backward as well as forward.

public class MinimumInsertionStepsToMakeAStringPalindrome_1312 {
    public int minInsertions(String s) {
        return s.length()-lps(s);
    }

    public int lps(String s) {
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
