package BinarySearch;

// Search insert position

// Given a sorted array of nums consisting of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.


public class SearchInsertPosition_35 {
     public int searchInsert(int[] nums, int target) {
       int st=0;
        int end=nums.length-1;

        while(st<=end){
           int mid=st+(end-st)/2;

           if(target==nums[mid]){
            return mid;
           }

           if(target<nums[mid]){
            end=mid-1;
           }
           else{
            st=mid+1;
           }
        }

        return st;
    }
}
