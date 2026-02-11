

import java.util.ArrayList;

// Find out how many times the array is rotated

// Given an integer array nums of size n, sorted in ascending order with distinct values. The array has been right rotated an unknown number of times, between 0 and n-1 (including). Determine the number of rotations performed on the array.


public class HowManyTimesArrayIsRotated {
     public int findKRotation(ArrayList<Integer> nums) {
           int n = nums.size();
        int st = 0;
        int end = n - 1;

        while (st < end) { // we can use < instead of <=
            int mid = st + (end - st) / 2;

            if (nums.get(mid) < nums.get(end)) {
                end = mid; // minimum is in left part including mid
            } else {
                st = mid + 1; // minimum is in right part
            }
        }

        return st;
    }
}
