package Array;

import java.util.ArrayList;
import java.util.List;

// 2161. Partition Array According to Given Pivot

// You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
// Every element less than pivot appears before every element greater than pivot.
// Every element equal to pivot appears in between the elements less than and greater than pivot.
// The relative order of the elements less than pivot and the elements greater than pivot is maintained.
// More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
// Return nums after the rearrangement.

public class PartitionArrayAccordingtoGivenPivot_2161 {
   public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                smaller.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        int[] result = new int[nums.length];
        int index = 0;

        for (int num : smaller) {
            result[index++] = num;
        }

        for (int num : equal) {
            result[index++] = num;
        }

        for (int num : greater) {
            result[index++] = num;
        }

        return result;
    } 
}
