package Array;

// Move Zeros to End


// Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
// This must be done in place, without making a copy of the array.

public class MoveZerosToEnd {
    static void swapArray(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;

        if(nums.length==1){
            return ;
        }

        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                swapArray(nums,i,j);
                i++;
            }
        }
    }
}
