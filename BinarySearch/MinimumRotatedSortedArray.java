package BinarySearch;

import java.util.ArrayList;

// Find minimum in Rotated Sorted Array

// Given an integer array nums of size N, sorted in ascending order with distinct values, and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.

public class MinimumRotatedSortedArray {
    public int findMin(ArrayList<Integer> arr) {
        int n = arr.size();
        int st = 0;
        int end = n - 1;

        while (st < end) { // we can use < instead of <=
            int mid = st + (end - st) / 2;

            if (arr.get(mid) < arr.get(end)) {
                end = mid; // minimum is in left part including mid
            } else {
                st = mid + 1; // minimum is in right part
            }
        }

        return arr.get(st);
    }
}
