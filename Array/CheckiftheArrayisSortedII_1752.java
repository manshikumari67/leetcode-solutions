package Array;

import java.util.ArrayList;

// Check if the Array is Sorted II
// Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

public class CheckiftheArrayisSortedII_1752 {

     public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        int n=nums.size();

         for (int i = 1; i < n; i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    
}
