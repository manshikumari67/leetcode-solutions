package Array;

// Sort an array of 0's 1's and 2's

// Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
// The sorting must be done in-place, without making a copy of the original array.

public class SortArray {
     static void swapArray(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortZeroOneTwo(int[] nums) {
         int n=nums.length;

      for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swapArray(nums,j,j+1);
                }
            }
        }
      
    }
}
