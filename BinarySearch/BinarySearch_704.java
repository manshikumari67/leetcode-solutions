package BinarySearch;

// BinarySearch

// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.

public class BinarySearch_704 {
    public int search(int[] nums, int target) {

        int n=nums.length;
        int st=0;
        int end=n-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==nums[mid]){
                return mid;
            }else if (nums[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        
        return -1;
    }
}
