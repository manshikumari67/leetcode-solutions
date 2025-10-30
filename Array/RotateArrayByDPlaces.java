package Array;

// Left Rotate Array by K Places


// Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.

public class RotateArrayByDPlaces {
    static void swapArray(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reverseArray(int[] nums,int i,int j){
        while(i<j){
            swapArray(nums,i,j);
            i++;
            j--;
        }
    }
    public void rotateArray(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
         reverseArray(nums, 0, k - 1);     
        reverseArray(nums, k, n - 1);     
        reverseArray(nums, 0, n - 1);  
           
    }
}
