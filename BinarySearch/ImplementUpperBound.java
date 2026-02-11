// Upper Bound

// Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
// The upper bound of x is defined as the smallest index i such that nums[i] > x.
// If no such index is found, return the size of the array.

public class ImplementUpperBound {
    public int upperBound(int[] nums, int x) {
       int st=0;
       int end=nums.length;
       int ans=nums.length;

       while(st<=end){
          int mid=st+(end-st)/2;
            if (nums[mid] > x) {
                ans = mid;      // possible answer, but check for smaller index
                end = mid - 1; // move left
            } else {
                st = mid + 1;  // move right
            }
        }

        return ans;
    }
}
