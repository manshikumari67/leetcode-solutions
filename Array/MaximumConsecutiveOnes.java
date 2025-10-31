package Array;

// Maximum Consecutive Ones

// Given a binary array nums, return the maximum number of consecutive 1s in the array.
// A binary array is an array that contains only 0s and 1s.


public class MaximumConsecutiveOnes {
     public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            }else{
                sum=0;
            }
            max=Math.max(max,sum);
        }

        return max; 
    }
}
