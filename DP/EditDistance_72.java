package DP;

// 72. Edit Distance

// Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
// You have the following three operations permitted on a word:
// Insert a character
// Delete a character
// Replace a character

public class EditDistance_72 {
    public int minDistance(String s1, String s2) {
        int m=s1.length(), n=s2.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return edit(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2), dp);
    }

    private int edit(int i, int j, StringBuilder s1, StringBuilder s2,int[][] dp){
        if(i<0) return j+1;  // inerting remaining chars of s2
        if(j<0) return i+1;  // remove extra chars of s1
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]= edit(i-1,j-1,s1,s2,dp);
        int replace=1+ edit(i-1,j-1,s1,s2,dp);
        int remove=1+ edit(i-1,j,s1,s2,dp);
        int insert=1+ edit(i,j-1,s1,s2,dp);

        return dp[i][j]=Math.min(replace,Math.min(remove,insert));
    }
}
