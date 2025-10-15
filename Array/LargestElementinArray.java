package Array;

public class LargestElementinArray {
     public int largestElement(int[] nums) {
       int n=nums.length;

       int maxElement=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
          if(nums[i]> maxElement){
            maxElement=nums[i];
          }
        }

        return maxElement;
    }
}
