
// 2236. Root Equals Sum of Children

// You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
// Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.

public class RootEqualsSumOfChildren_2236 {
    public boolean checkTree(TreeNode root) {
         int root_val = root.val;
        int left_val = root.left.val;
        int right_val = root.right.val;

        return root_val == (left_val + right_val);
    }
}
