package Array;

// Linear Search

// Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1.


public class LinearSearch {
    public int linearSearch(int nums[], int target) {
		//Your code goes here

    for(int i=0;i<nums.length;i++){
      if(nums[i]==target){
        return i;
      }
    }
    return -1;
  }
    
}
