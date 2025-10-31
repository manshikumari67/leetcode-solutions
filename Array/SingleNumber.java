package Array;

// Single Number - I

// Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.

public class SingleNumber {
        public int singleNumber(int[] nums) {
        //your code goes here
         int n=nums.length;
        if(nums.length==1) return nums[0];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    nums[i]=Integer.MIN_VALUE;
                    nums[j]=Integer.MIN_VALUE;
                }
            }
        }

        int single=0;

        for(int i=0;i<n;i++){
            if(nums[i]>Integer.MIN_VALUE){
                single= nums[i];
            }
        }

       return single; 
    }
}
