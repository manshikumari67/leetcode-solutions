// Search in rotated sorted array-I

// Given an integer array nums, sorted in ascending order (with distinct values) and a target value k. The array is rotated at some pivot point that is unknown. Find the index at which k is present and if k is not present return -1.

public class SearchinSortedArray {
     public int search(int[] nums, int k) {
       // int ans=-1;
        int st=0;int end=nums.length-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            
            if(nums[mid]==k){
                return mid;
            }
            else if(nums[mid]<=nums[end]){
                if(k>nums[mid] && k<=nums[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{
                if(k>=nums[st] && k<nums[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
}
