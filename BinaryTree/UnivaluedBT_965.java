

// 965. Univalued Binary Tree

// A binary tree is uni-valued if every node in the tree has the same value.
// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

 
public class UnivaluedBT_965 {
     public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;

        if (root.left != null && root.left.val != root.val)
            return false;

        if (root.right != null && root.right.val != root.val)
            return false;

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
    
}
