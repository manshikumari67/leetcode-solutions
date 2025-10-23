package BinarySearch;

// Lower Bound

// Given a sorted array of nums and an integer x, write a program to find the lower bound of x.
// The lower bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
// If no such index is found, return the size of the array.

public class ImplementLowerBound {
    public int lowerBound(int[] nums, int x) {
       int st=0;
       int end=nums.length;
       int ans=nums.length;

       while(st<=end){
          int mid=st+(end-st)/2;
            if(nums[mid]>=x){
             ans=mid;
             end=mid-1;
            }
            else{
                st=mid+1;
            }
        }

        return ans;
     }
}
