

// 108.Convert Sorted Array to Binary Tree

// Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

public class ConvertArrayToBST_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
      int n=nums.length;
      return convert(nums,0,n-1);  
    }

    public TreeNode convert(int[] arr, int lo, int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=convert(arr,lo,mid-1);
        root.right=convert(arr,mid+1,hi);
        return root;
    }
}
