
// 543. Diameter of Binary Tree

// Given the root of a binary tree, return the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
// The length of a path between two nodes is represented by the number of edges between them.


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



public class DiameterOfBinaryTree_543 {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        levels(root);
        return max;
    }

    int levels(TreeNode root){
       if(root==null) return 0;
       int leftLevels=levels(root.left);
       int rightLevels=levels(root.right);
       max=Math.max(max,leftLevels+rightLevels);
       return 1+Math.max(leftLevels, rightLevels); 
    }
}
