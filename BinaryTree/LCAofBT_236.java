

// 236. Lowest Common Ancestor of a Binary Tree

// Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

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

public class LCAofBT_236 {
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        boolean pLiesInLeft = exists(root.left, p);
        boolean qLiesInLeft = exists(root.left, q);

        if (pLiesInLeft && qLiesInLeft)
            return lowestCommonAncestor(root.left, p, q);
        else if (!pLiesInLeft && !qLiesInLeft)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }

    private boolean exists(TreeNode root, TreeNode target) {
        if (root == null) return false;
        if (root == target) return true;
        return exists(root.left, target) || exists(root.right, target);
    }

}
