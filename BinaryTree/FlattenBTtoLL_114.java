

// 114. Flatten Binary Tree to Linked List

// Given the root of a binary tree, flatten the tree into a "linked list":
// The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
// The "linked list" should be in the same order as a pre-order traversal of the binary tree.

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

public class FlattenBTtoLL_114 {
     public void flatten(TreeNode root){
        if (root==null) return;
        TreeNode lst=root.left;
        TreeNode rst=root.right;
        root.left=null;
        root.right=null;
        flatten(lst);
        flatten(rst);
        root.right=lst;
        TreeNode last=root;
        while(last.right!=null) last=last.right;
        last.right=rst;
    }
}
