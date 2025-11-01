package Array;

// Longest subarray with sum K


// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

public class LongestSubArrayWithSumK {
    public int longestSubarray(int[] nums, int k) {
       int maxlen=0;

       for(int i=0;i<nums.length;i++){
        int currentSum=0;

        for(int j=i;j<nums.length;j++){
            currentSum+=nums[j];

            if(currentSum==k){
                int currentLength=j-i+1;

                maxlen=Math.max(maxlen,currentLength);
            }
        }
       }

       return maxlen;
    }
}
