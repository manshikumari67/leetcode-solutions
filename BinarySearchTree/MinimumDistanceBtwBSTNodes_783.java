
// 783.Minimum Distance Between BST Nodes

// Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

class Solution {
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }
    private int ans = Integer.MAX_VALUE;
    private Integer pred = null;

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (pred != null)
        ans = Math.min(ans, root.val - pred);
        pred = root.val;
        inorder(root.right);
  }
}