// 33. Search in Rotated Sorted Array

// There is an integer array nums sorted in ascending order (with distinct values). 

public class SearchInRotatedSortedArray_33 {
    public int search(int[] nums, int target) {
       // int ans=-1;
        int st=0;int end=nums.length-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<=nums[end]){
                if(target>nums[mid] && target<=nums[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{
                if(target>=nums[st] &&target<nums[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1; 
    }
}
