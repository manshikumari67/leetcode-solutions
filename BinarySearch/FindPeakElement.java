package BinarySearch;

// Find peak element


// Given an array arr of integers. A peak element is defined as an element greater than both of its neighbors.
// Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].
// Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.
// Note:
// As there can be many peak values, true is given as output if the returned index is a peak number, otherwise false.

public class FindPeakElement {
    public int findPeakElement(int[] arr) {
       int n=arr.length;
       int st=0;int end=n-1;
        
        while(st<=end){
            int mid=st+(end-st)/2;
             if((mid==0|| arr[mid]>arr[mid-1]) && (mid==n-1||arr[mid]>arr[mid+1])){
                return mid;
             }
            if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
