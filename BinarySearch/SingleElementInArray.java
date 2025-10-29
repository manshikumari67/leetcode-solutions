package BinarySearch;

// Single element in sorted array

// Given an array nums sorted in non-decreasing order. Every number in the array except one appears twice. Find the single number in the array.

public class SingleElementInArray {

    public int singleNonDuplicate(int[] nums) {
      int n=nums.length;
      int st=0;int end=n-1;

      while(st<end){
        int mid=st+(end-st)/2;
        if(mid%2==1){
          mid--;
        }
        if(nums[mid]!=nums[mid+1]){
          end=mid;
        }else{
          st=mid+2;
        }
      }
      return nums[end];
  }
    
}
