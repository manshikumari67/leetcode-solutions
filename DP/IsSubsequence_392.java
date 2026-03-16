package DP;

// 392. Is Subsequence

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

public class IsSubsequence_392 {
     public boolean isSubsequence(String s, String t) {
           int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
