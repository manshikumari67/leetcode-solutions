package Array;

import java.util.ArrayList;
import java.util.List;

// 2553. Separate the Digits in an Array

// Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.
// To separate the digits of an integer is to get all the digits it has in the same order.
// For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].

public class SeparatetheDigitsinanArray_2553 {
     public int[] separateDigits(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {

                list.add(ch - '0');
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
