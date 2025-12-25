
// 110.Balanced Binary Tree

// Given a binary tree, determine if it is height-balanced.

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
}


public class BalanacedBinaryTree_110 {
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
         if(root==null) return true;
         flag=true;
         levels(root);
         return flag;
    }
    int levels(TreeNode root){
       if(root==null) return 0;
       int leftLevels=levels(root.left);
       int rightLevels=levels(root.right);
       if(Math.abs(leftLevels-rightLevels)>1) flag=false;
       return 1+Math.max(leftLevels, rightLevels); 
    }
}
