package DP;

import java.util.ArrayList;
import java.util.List;

// 2900. Longest Unequal Adjacent Groups Subsequence I

// You are given a 0-indexed string array words and a 0-indexed integer array groups of the same length. The groups array contains only 0s and 1s, where 0 represents a group of words that are not equal to each other, and 1 represents a group of words that are equal to each other.

public class LongestUnequalAdjacentGroupsSubSequenceI_2900 {
     public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        int order = -1;
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != order) {
                order = groups[i];
                res.add(words[i]);
            }
        }
        return res;
    }
}
