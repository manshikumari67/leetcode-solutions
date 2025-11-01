package Array;

// Two Sum

// Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
// Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in increasing order.

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] res=new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                  res[0]=i;
                  res[1]=j;
                }
            }
        }

        return res;
    }
}
