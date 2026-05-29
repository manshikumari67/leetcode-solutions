package Array;

// 3300. Minimum Element After Replacement With Digit Sum

// You are given an integer array nums.
// You replace each element in nums with the sum of its digits.
// Return the minimum element in nums after all replacements.

public class MinimumElementAfterReplacementWithDigitSum_3300 {
    public int minElement(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        
        for (int num : nums) {
            int currentSum = 0;
            
            while (num > 0) {
                currentSum += num % 10;
                num /= 10;
            }
            
            minVal = Math.min(minVal, currentSum);
        }
        
        return minVal;
    }
}
